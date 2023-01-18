package com.jbqneto.nwlsetup.application.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_days")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private LocalDateTime date;

    @ManyToMany
    @JoinTable(
            name = "tb_day_habits",
            joinColumns = @JoinColumn(name = "day_id"),
            inverseJoinColumns = @JoinColumn(name = "habit_id")
    )
    private Set<Habit> dayHabbits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Set<Habit> getDayHabbits() {
        return dayHabbits;
    }

    public void setDayHabbits(Set<Habit> dayHabbits) {
        this.dayHabbits = dayHabbits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return Objects.equals(id, day.id)
                && Objects.equals(date, day.date) && Objects.equals(dayHabbits, day.dayHabbits);
    }

    @Override
    public String toString() {
        return "Day{" +
                "id=" + id +
                ", date=" + date +
                ", dayHabbits=" + dayHabbits +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, dayHabbits);
    }
}
