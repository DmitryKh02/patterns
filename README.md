# Patterns


### Приветствую! Ниже представлено описание четырех проектов, которые были разработаны в рамках домашней работы:

## Проект "Логирование"

Описание: В этом проекте был создан класс Logger, который предоставляет метод logInfo() для логирования информации о переданном классе и дополнительной информации. Метод выводит сообщение в консоль в формате "log info: {ClassName}, {AdditionalInfo}".

Как использовать:
```
Logger logger = new Logger();

logger.logInfo(FirstClass.class, "This is additional information.");
```


## Проект "Фабрика кофе"

Описание: В этом проекте была реализована иерархия классов для создания различных видов кофе через фабричный метод. Был создан абстрактный класс Coffee, от которого наследовались классы Espresso и Americano. Затем была создана фабрика CoffeeFactory, которая содержит метод createCoffee(), возвращающий экземпляр нужного типа кофе.

Как использовать:

```
CoffeeFactory coffeeFactory = new CoffeeFactory();

Coffee espresso = coffeeFactory.createCoffee("espresso");

Coffee americano = coffeeFactory.createCoffee("americano");
```

### ***Также в проекте была реализованна Абстрактная фабрика.***

## Проект "Adapter"

Описание: В данном проекте был создан класс Computer, который может читать информацию только с USB. Затем был реализован адаптер CardAdapter, который позволяет читать информацию с карты памяти и передавать ее в компьютер через USB.



Как использовать:
```
Computer computer = new Computer();

Card card = new Card();

CardAdapter cardAdapter = new CardAdapter(card);

computer.readData(cardAdapter);
```


## Проект "Прокси для базы данных"

Описание: В этом проекте был создан класс DatabaseProxy, который предоставляет доступ к базе данных через прокси. Прокси добавляет полный адрес сервера к названию базы данных при подключении. Был создан интерфейс Database и его реализация DatabaseImpl, которая представляет реальное подключение к базе данных.



Как использовать:
```
Database database = new DatabaseProxy("localhost:5432", "my_database");

database.connect();
```
