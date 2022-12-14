# Code design patterns

Паттерны проектирования были созданы, основываясь на опыте разработчиков при решении шаблонных задач.

## Виды паттернов проектирования

- [Порождающие](#порождающие-паттерны)
- [Структурные](#структурные-паттерны)
- [Поведенческие](#поведенческие-паттерны)

## Порождающие паттерны

- [Singleton](src/creational/singleton/Main.java) - ограничивает создание объектов определенного класса, 
обеспечивая доступ только к одному экземпляру.
- [Builder](src/creational/builder/Main.java) - упрощает создание сложных объектов за счет постепенной конфигурации.
- [Factory](src/creational/factory/Main.java) - создание определенного класса-наследника 
супер-класса по входным параметрам.
- [AbstractFactory](src/creational/abstractfactory/Main.java) - вместо одной фабрики мы используем **одну** 
из реализаций фабрики в зависимости от параметров. То есть по факту это фабрика фабрик(еще один слой).
- [Prototype](src/creational/prototype/Main.java) - помогает создавать дублирующий объект на основе уже 
существующего

## Структурные паттерны

- [Adapter](src/structural/adapter/Main.java) - позволяет совмещать несвязанные интерфейсы через посредника.
- [Facade](src/structural/facade/Main.java) - позволяет скрывать от пользователя сложную реализацию и предоставляет
просто интерфейс для взаимодействия.
- [Proxy](src/structural/proxy/Main.java) - позволяет обернуть нужный класс в прокси для добавления мета действий
(например измерение производительности или логгирование)
- [Composite](src/structural/composite/Main.java) - позволяет скомпоновать все необходимые объекты, чтобы не вызывать их
по отдельности

## Поведенческие паттерны
