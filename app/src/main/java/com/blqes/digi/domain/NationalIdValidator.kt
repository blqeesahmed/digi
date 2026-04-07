package com.blqes.digi.domain.validation

object NationalIdValidator {

    fun isValid(nationalId: String): Boolean {

        return nationalId.length == 14
    }
}