package de.ropemc.api.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private static Map<Listener, List<Method>> events = new HashMap<Listener, List<Method>>();

    public static void callEvent(Event e) {
        for (Listener l : events.keySet()) {
            for (Method m : events.get(l)) {
                if (m.getParameterTypes()[0].equals(e.getClass())) {
                    try {
                        m.invoke(l, e);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    public static void registerListener(Listener listener) {
        if (events.containsKey(listener)) return;
        List<Method> ml = new ArrayList<Method>();
        for (Method m : listener.getClass().getDeclaredMethods()) {
            if (m.getAnnotation(EventHandler.class) != null) {
                if (m.getParameterCount() == 1) {
                    m.setAccessible(true);
                    ml.add(m);
                }
            }
        }
        events.put(listener, ml);
    }

    public static void unregisterListener(Listener listener) {
        if (!events.containsKey(listener)) return;
        events.remove(listener);
    }

}
