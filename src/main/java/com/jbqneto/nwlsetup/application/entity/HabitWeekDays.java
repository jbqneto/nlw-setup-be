package com.jbqneto.nwlsetup.application.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_habit_week_days")
public class HabitWeekDays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private int weekDay;

    @ManyToOne
    @JoinColumn(name = "habit_id")
    @JsonIgnoreProperties("weekDays")
    private Habit habit;

    public Habit getHabit() {
        return habit;
    }

    public void setHabit(Habit habit) {
        this.habit = habit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return "HabitWeekDays{" +
                "id=" + id +
                ", weekDay=" + weekDay +
                ", habit=" + habit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitWeekDays that = (HabitWeekDays) o;
        return weekDay == that.weekDay && Objects.equals(id, that.id) && Objects.equals(habit, that.habit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weekDay, habit);
    }
}
