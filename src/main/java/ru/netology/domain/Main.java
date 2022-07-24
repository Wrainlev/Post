package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name ="Иван";
        post.passport="2205 №45692356";
        post.patronymic="Сергеевич";
        post.phone="+7 (909)-256-78-99";
        post.surname="Сидоров";
        post.subscription=true;
        post.birthday=new FormDate();
        post.birthday.day=24;
        post.birthday.month=4;
        post.birthday.year=1985;
        }
    }

