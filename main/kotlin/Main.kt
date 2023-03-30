// Rat 4
/* In a class of 57 students the teacher was collecting data of her students,
The data she required was:
The gender of the students
The course they are doing
the feedback on boys playing football
the feedback on the ladies playing hockey
the feedback on the curriculum
Using inheritance, represent the gender and the course as
properties and the feedback as methods
 */
fun main(args: Array<String>) {
    var student1 = Student()
    student1.gender = "male and female"
    student1.course = "education and engineering"
    println("The class has both ${student1.gender} gender, and the are taking ${student1.course} courses.")
    student1.curriculum()

    var boys1 = Boys()
    boys1.gender = ("male")
    boys1.course = "education"
    println("Most of the boys are ${boys1.gender} and they are taking ${boys1.course} course.")
    boys1.curriculum()
    boys1.football()

    var girls1 = Girls()
    girls1.gender = "female"
    girls1.course = "engineering"
    println("The class also has ${girls1.gender} gender and they are taking ${girls1.course} course.")
    girls1.hockey()
    girls1.curriculum()

}

open class Student {
    var gender: String = ""
    var course: String = ""

    fun curriculum() {
        println("We are using 8-4-4 curriculum")
    }
}

class Boys: Student() {
    fun football() {
        println("The number of boys playing football is 30")
    }
}

class Girls: Student() {
    fun hockey() {
        println("The number of ladies playing hockey is 27")
    }
}