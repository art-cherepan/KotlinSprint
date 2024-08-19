package lesson2

fun main() {
    val employeesCount = 50
    val internCount = 30
    val employeeSalary = 30_000
    val internSalary = 20_000

    val totalEmployeeSalary = employeeSalary * employeesCount
    val totalInternSalary = internCount * internSalary
    val totalSalary = totalEmployeeSalary + totalInternSalary
    val averageSalary = (totalInternSalary + totalEmployeeSalary) / (internCount + employeesCount)

    println("Расходы на выплату зарплаты постоянных сотрудников: $totalEmployeeSalary")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")
}