Вопросы для самоконтроля:

1. Что означает аннотация  Before?
   Ответ: используется для того, чтобы выполнить какое-то условие до тестирующих методов.
   Это удобно в части того, что не нужно дублировать код перед каждым тестовым методом.
   
2. Как в тесте проверить, что метод должен бросить исключение?
   Ответ: это можно проверить с помощью например статического метода assertThrows() JUnit.
   
3. Что такое mock? Spy?
   Ответ: Mock - подельный объект, который имитирует реальное поведение объекта, а Spy - реальная реализация объекта,
   но с возможностью отслеживать и менять поведение в методах для целей тестирования.
   
4. Для чего применяется статический метод  Mockito.verify?
   Ответ: проевряет действительно ли вызывался mock - объект с определенными параметрами или вызывался ли он в принципе.
