### Задание 1. Ответьте письменно на вопросы:

1)  #### Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

    Использование заглушек позволяет тестировать юнит-единицу кода изолированно от другого кода, что облегчает и ускоряет исследование тестируемого кода. Такой подход позволяет избежать ошибок и сложностей, которые могут вызывать зависимости от смежных единиц кода.

2) #### Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

    Обычно для этого используется подставной(mock) объект - заглушкa метода, которая имитирует вызов (дает возможность проверить правильность вызова метода) с конкретными аргументами и ответ метода на вызов с этими аргументами.


3) #### Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

    Для этого используется простая заглушка Stab в которой содержатся предопределённые данные и заглушка использует их для ответа на вызовы во время тестов без проверки самого вызова метода.

4) ##### Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

    Теоретически - Fake заглушку, реализующую интерфейс, которая содержит фиксированные данные без логики и просто возвращает «хорошие» или «плохие» данные в зависимости от реализации. Но, например, если из базы данных нужны только данные для проверки метода, вполне подойдет и mock.
