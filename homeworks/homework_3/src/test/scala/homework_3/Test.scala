package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(413) == "413")
            assert(Exercises.prettyBooleanFormatter1("правда") == "правда")
            assert(Exercises.prettyBooleanFormatter1(("не правда","не ложь")) == "(не правда,не ложь)")
        }
        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(413) == "413")
            assert(Exercises.prettyBooleanFormatter2("правда") == "правда")
            assert(Exercises.prettyBooleanFormatter2(("не правда","не ложь")) == "(не правда,не ложь)")
        }
        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(413) == "413")
            assert(Exercises.prettyBooleanFormatter3("правда") == "правда")
            assert(Exercises.prettyBooleanFormatter3(("не правда","не ложь")) == "(не правда,не ложь)")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max1(Seq(0, 0, 0)) == 0)
            assert(Exercises.max1(Seq(8, 42, 13)) == 42)
            assert(Exercises.max1(Seq(-18, -2)) == -2)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq()).isEmpty)
            assert(Exercises.max2(Seq(0, 0, 0)) == Seq(0))
            assert(Exercises.max2(Seq(8, 42, 13)) == Seq(42))
            assert(Exercises.max2(Seq(-18, -2)) == Seq(-2))
        }

        'test_max3 - {
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(0, 0, 0)) == Option(0))
            assert(Exercises.max3(Seq(8, 42, 13)) == Option(42))
            assert(Exercises.max3(Seq(-18, -2)) == Option(-2))
        }

        'test_sum1 - {
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(8, 42) == 50)
            assert(Exercises.sum1(-18, -2) == -20)
        }

        'test_sum2 - {
            assert(Exercises.sum2(0, 0) == 0)
            assert(Exercises.sum2(8, 42) == 50)
            assert(Exercises.sum2(-18, -2) == -20)
        }

        'test_sum3 - {
            assert(Exercises.sum3(0, 0) == 0)
            assert(Exercises.sum3(8, 42) == 50)
            assert(Exercises.sum3(-18, -2) == -20)
        }

    }
}
