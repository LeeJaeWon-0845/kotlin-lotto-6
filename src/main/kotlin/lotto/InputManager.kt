package lotto

import camp.nextstep.edu.missionutils.Console

class InputManager {
    private val exceptionManager = ExceptionManager()
    fun inputMoney(): Int {
        println(PRINT_INPUT_MONEY)
        val money = Console.readLine().trim()
        exceptionManager.moneyException(money)
        return money.toInt()
    }

    fun qinputWinningNumber(): Pair<List<Int>,Int> {
        println(PRINT_INPUT_WINNING_NUMBER)
        val nums = Console.readLine().split(DELIMITER)
        exceptionManager.winningNumberException(nums)
        println()

        println(PRINT_INPUT_BONUS_NUMBER)
        val num = Console.readLine().trim()
        exceptionManager.bonusNumberException(Pair(nums,num))
        println()

        return Pair(nums.map { it.toInt() } ,num.toInt())
    }

//    fun qinputBonusNumber(): Int {
//        println(PRINT_INPUT_BONUS_NUMBER)
//        val num = Console.readLine().trim()
//        exceptionManager.bonusNumberException(num)
//        println()
//        return num.toInt()
//    }

    companion object {

        private const val DELIMITER = ","
        private const val PRINT_INPUT_MONEY = "구입금액을 입력해 주세요."
        private const val PRINT_INPUT_WINNING_NUMBER = "당첨 번호를 입력해 주세요."
        private const val PRINT_INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요."

    }
}