# Input Validation Practice

Small console tasks for practicing `Scanner`, loops, arrays, conditions, and invalid input handling.

The goal of this folder is to write each solution independently first, then review it for correctness, edge cases, naming, method responsibility, and readability.

## Tasks

| Task | Name | Status | Main Practice |
| --- | --- | --- | --- |
| 1 | Exam Average | Done | Numeric validation, arrays, average calculation |
| 2 | Temperature Log | Done | Range validation, average, minimum, maximum |
| 3 | Shopping Budget | Planned | Positive-number validation, totals, comparison |
| 4 | Password Attempts | Planned | Limited attempts, string comparison, loop control |
| 5 | Number Classifier | Planned | Integer validation, counters, categories |

## Task 1: Exam Average

Ask the user for 5 exam grades from 0 to 10. Ignore invalid input and keep asking until 5 valid grades are entered. Print the average and whether the student passed. Passing average is 6 or higher.

Implementation:

- `src/main/java/sandbox/selfpractice/inputvalidation/task1/ExamAverage.java`

## Task 2: Temperature Log

Ask the user for 7 daily temperatures. Accept only values from -50 to 60. Print the average temperature, the lowest value, and the highest value.

Implementation:

- `src/main/java/sandbox/selfpractice/inputvalidation/task2/TemperatureLog.java`

Review focus:

- Keep asking until 7 valid temperatures are entered.
- Consume invalid non-numeric input safely.
- Do not accidentally skip the next valid input after an out-of-range number.
- Keep calculation methods separate from console input/output.

## Task 3: Shopping Budget

Ask the user for a budget and then for 5 item prices. Prices must be greater than 0. Print the total price and whether the budget is enough.

## Task 4: Password Attempts

Ask the user to enter a password. Give only 3 attempts. Print whether access is granted or denied.

## Task 5: Number Classifier

Ask the user for 10 valid integers. Count how many are positive, negative, and zero.
