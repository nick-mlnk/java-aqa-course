# java-aqa-course

Java automation quality assurance course

### 5 Session covers:

- [abstract classes](abstract1)
- [enums](enums)
- [interfaces](interfaces)

### Home-task:

1. Create abstract class Department
    - field: String name
    - constructors and accessors if needed
    - method: abstract int getAmountOfEmployees()
2. Create subclass of Department w/ name ItDepartment
3. Create subclasses of Department classes w/ names QaDepartment & DevDepartment
4. Create Enum w/ name Title
    - values: JUNIOR, MIDDLE, SENIOR, TECH_LEAD, MANAGER
5. Create interface ISpecialty
    - method: Title getPosition();
6. Create classes which will implement ISpecialty:
    - QA/Dev classes:
        - fields: Title position, String name
        - constructors/accessors/toString if needed
7. Add to the class QaDepartment field as an array: QA[] qas
8. Add to the class DevDepartment field as an array: Dev[] devs
9. Add to the class ItDepartment field as an array: Department[] departments
10. Add constructors and accessors if needed to classes QaDepartment/DevDepartment/ItDepartment
11. Create Demo class:
    - print ItDepartment info(should include info about amount of employees, their positions)