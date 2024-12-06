package com.jeido.exercises.exercise10.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event implements Prestation {
    private String eventName;
    private LocalDateTime date;
    private String location;
    private List<Prestation> prestations;

    public Event(String eventName, LocalDateTime date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        prestations = new ArrayList<>();
    }

    public void addPrestation(Prestation p) {
        if (p == null || p == this || prestations.contains(p)) return;

        prestations.add(p);
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event '").append(eventName).append("' (").append(date.toString()).append(")\n");
        sb.append("Location: ").append(location).append("\n");
        for (Prestation p : prestations) {
            sb.append(p.getDetails());
        }
        return sb.toString();
    }

    public static class Builder {
        private String eventName;
        private LocalDateTime date;
        private String location;

        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder date(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Event build() {
            return new Event(eventName, date, location);
        }
    }
}
