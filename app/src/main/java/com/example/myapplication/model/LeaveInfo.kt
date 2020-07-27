package com.example.myapplication.model

data class LeaveInfo(
    //userName: String,
    var leaveType: String = "",
    var fromDate: String = "",
    var toDate: String = "",
    var isHalfDayLeave: Boolean = false,
    var purpose: String = "",
    var address: String = "",
    var email: String = "",
    var contact: String = "",
    var status: Int= 1
)