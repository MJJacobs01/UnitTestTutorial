package com.jacobs.mj.unittesttutorial

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by mj on 2021/02/21 at 4:39 PM
 */
@RunWith(JUnit4::class)
class ValidatorTest{

    @Test
    fun whenInputIsValid(){
        //  Test case for passing validation
        val amount = 100
        val description = "Same random description"
        val result = Validator.validateInput(amount, description)
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun whenAmountIsZero(){
        //  Test case for passing validation
        val amount = 0
        val description = "Same random description"
        val result = Validator.validateInput(amount, description)
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun whenDescriptionIsEmpty(){
        //  Test case for passing validation
        val amount = 100
        val description = ""
        val result = Validator.validateInput(amount, description)
        assertThat(result).isEqualTo(false)
    }
}