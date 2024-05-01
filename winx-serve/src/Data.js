export const jsonData = [ {
  "name" : "HospitalManagementSystem",
  "interfaces" : [ {
    "name" : "PatientRecords",
    "functions" : [ {
      "name" : "FetchPatientDetails",
      "access_modifier" : "public",
      "implemented_interface" : "none",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "patientId"
      } ],
      "returnTypes" : [ {
        "type" : "\"PatientDetails\"",
        "identifier" : "details"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"3s\""
      }, {
        "key" : "MaxReturnVals",
        "value" : "\"1\""
      }, {
        "key" : "DataFormat",
        "value" : "\"ID: %patientId, DOB: %dob\""
      }, {
        "key" : "DataPrivacy",
        "value" : "\"High\""
      } ]
    }, {
      "name" : "UpdatePatientRecord",
      "access_modifier" : "public",
      "implemented_interface" : "none",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "patientId"
      }, {
        "type" : "STRING",
        "identifier" : "updates"
      } ],
      "returnTypes" : [ {
        "type" : "\"UpdateConfirmation\"",
        "identifier" : "confirmation"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"3s\""
      }, {
        "key" : "DataIntegrity",
        "value" : "\"High\""
      }, {
        "key" : "DataConcurrency",
        "value" : "\"Serializable\""
      } ]
    } ]
  }, {
    "name" : "AppointmentSystem",
    "functions" : [ {
      "name" : "ScheduleAppointment",
      "access_modifier" : "public",
      "implemented_interface" : "none",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "patientId"
      }, {
        "type" : "STRING",
        "identifier" : "dateTime"
      }, {
        "type" : "STRING",
        "identifier" : "doctorId"
      } ],
      "returnTypes" : [ {
        "type" : "\"AppointmentConfirmation\"",
        "identifier" : "confirmation"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"4s\""
      }, {
        "key" : "Notification",
        "value" : "\"Email\""
      }, {
        "key" : "DataValidation",
        "value" : "\"TimeSlotAvailability\""
      } ]
    }, {
      "name" : "CancelAppointment",
      "access_modifier" : "public",
      "implemented_interface" : "none",
      "importance" : "optional",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "appointmentId"
      } ],
      "returnTypes" : [ {
        "type" : "\"CancellationConfirmation\"",
        "identifier" : "status"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"2s\""
      }, {
        "key" : "CancellationFee",
        "value" : "\"NoChargeWithin24h\""
      } ]
    } ]
  }, {
    "name" : "StaffManagement",
    "functions" : [ {
      "name" : "FetchStaffDetails",
      "access_modifier" : "public",
      "implemented_interface" : "none",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "staffId"
      } ],
      "returnTypes" : [ {
        "type" : "\"StaffDetails\"",
        "identifier" : "detailList"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"4s\""
      }, {
        "key" : "MaxReturnVals",
        "value" : "\"1\""
      }, {
        "key" : "DataFormat",
        "value" : "\"Staff ID: %staffId, Role: %role\""
      }, {
        "key" : "AccessLevel",
        "value" : "\"HR_Only\""
      } ]
    }, {
      "name" : "UpdateStaffRecord",
      "access_modifier" : "public",
      "implemented_interface" : "none",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "staffId"
      }, {
        "type" : "STRING",
        "identifier" : "updates"
      } ],
      "returnTypes" : [ {
        "type" : "\"UpdateConfirmation\"",
        "identifier" : "status"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"4s\""
      }, {
        "key" : "TransactionType",
        "value" : "\"Atomic\""
      }, {
        "key" : "DataIntegrity",
        "value" : "\"EnsureConsistency\""
      } ]
    }, {
      "name" : "AssignStaff",
      "access_modifier" : "public",
      "implemented_interface" : "none",
      "importance" : "optional",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "staffId"
      }, {
        "type" : "STRING",
        "identifier" : "departmentId"
      } ],
      "returnTypes" : [ {
        "type" : "\"AssignmentConfirmation\"",
        "identifier" : "confirmation"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"3s\""
      }, {
        "key" : "AuditTrail",
        "value" : "\"Enabled\""
      }, {
        "key" : "DataLogging",
        "value" : "\"Detailed\""
      } ]
    } ]
  } ],
  "specifications" : [ {
    "name" : "ComprehensiveMedicalRecords",
    "implemented_interface" : "PatientRecords",
    "requirements" : [ {
      "name" : "ComprehensiveRecordsMember",
      "annotations" : [ {
        "importance" : "optional",
        "name" : "UserHasAdminAccess"
      }, {
        "importance" : "critical",
        "name" : "UserIsNotInactive"
      } ]
    } ],
    "results" : [ {
      "name" : "AdminPanel",
      "importance" : "optional"
    }, {
      "name" : "MedicalRecordsDashboard",
      "importance" : "critical"
    }, {
      "name" : "Clock",
      "importance" : "none"
    } ],
    "functions" : [ {
      "name" : "FetchPatientDetails",
      "access_modifier" : "public",
      "implemented_interface" : "PatientRecords",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "patientId"
      } ],
      "returnTypes" : [ {
        "type" : "\"PatientDetails\"",
        "identifier" : "patientDetails"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"3s\""
      }, {
        "key" : "DataCache",
        "value" : "\"Enabled\""
      }, {
        "key" : "CacheExpiry",
        "value" : "\"24h\""
      } ]
    }, {
      "name" : "UpdatePatientRecord",
      "access_modifier" : "public",
      "implemented_interface" : "PatientRecords",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "patientId"
      }, {
        "type" : "STRING",
        "identifier" : "updates"
      } ],
      "returnTypes" : [ {
        "type" : "\"UpdateConfirmation\"",
        "identifier" : "status"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"3s\""
      }, {
        "key" : "RecordLocking",
        "value" : "\"Optimistic\""
      } ]
    }, {
      "name" : "ScheduleAppointment",
      "access_modifier" : "public",
      "implemented_interface" : "AppointmentSystem",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "patientId"
      }, {
        "type" : "STRING",
        "identifier" : "dateTime"
      }, {
        "type" : "STRING",
        "identifier" : "doctorId"
      } ],
      "returnTypes" : [ {
        "type" : "\"AppointmentConfirmation\"",
        "identifier" : "schedule"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"4s\""
      }, {
        "key" : "OverbookingPolicy",
        "value" : "\"Disallow\""
      } ]
    }, {
      "name" : "CancelAppointment",
      "access_modifier" : "public",
      "implemented_interface" : "AppointmentSystem",
      "importance" : "optional",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "appointmentId"
      } ],
      "returnTypes" : [ {
        "type" : "\"CancellationConfirmation\"",
        "identifier" : "status"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"2s\""
      }, {
        "key" : "RefundPolicy",
        "value" : "\"FullIf48hPrior\""
      } ]
    } ],
    "implementedInterface" : "PatientRecords"
  }, {
    "name" : "StaffAdministration",
    "implemented_interface" : "StaffManagement",
    "requirements" : [ {
      "name" : "StaffAdminMember",
      "annotations" : [ {
        "importance" : "optional",
        "name" : "UserHasHRAccess"
      }, {
        "importance" : "critical",
        "name" : "UserIsVerified"
      } ]
    } ],
    "results" : [ {
      "name" : "HRPanel",
      "importance" : "optional"
    }, {
      "name" : "StaffManagementDashboard",
      "importance" : "critical"
    }, {
      "name" : "Clock",
      "importance" : "none"
    } ],
    "functions" : [ {
      "name" : "FetchStaffDetails",
      "access_modifier" : "public",
      "implemented_interface" : "StaffManagement",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "staffId"
      } ],
      "returnTypes" : [ {
        "type" : "\"StaffDetails\"",
        "identifier" : "staffDetails"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"4s\""
      }, {
        "key" : "DataAccess",
        "value" : "\"SecureQuery\""
      }, {
        "key" : "FilterSensitiveData",
        "value" : "\"Enabled\""
      } ]
    }, {
      "name" : "UpdateStaffRecord",
      "access_modifier" : "public",
      "implemented_interface" : "StaffManagement",
      "importance" : "critical",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "staffId"
      }, {
        "type" : "STRING",
        "identifier" : "updates"
      } ],
      "returnTypes" : [ {
        "type" : "\"UpdateConfirmation\"",
        "identifier" : "status"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"4s\""
      }, {
        "key" : "ChangeManagement",
        "value" : "\"Controlled\""
      }, {
        "key" : "DataHistory",
        "value" : "\"Logged\""
      } ]
    }, {
      "name" : "AssignStaff",
      "access_modifier" : "public",
      "implemented_interface" : "StaffManagement",
      "importance" : "optional",
      "inputTypes" : [ {
        "type" : "FLOAT",
        "identifier" : "staffId"
      }, {
        "type" : "STRING",
        "identifier" : "departmentId"
      } ],
      "returnTypes" : [ {
        "type" : "\"AssignmentConfirmation\"",
        "identifier" : "status"
      } ],
      "specificationEntries" : [ {
        "key" : "ExecTime",
        "value" : "\"3s\""
      }, {
        "key" : "PermissionCheck",
        "value" : "\"DepartmentHeadApproval\""
      }, {
        "key" : "RealTimeUpdate",
        "value" : "\"Required\""
      } ]
    } ],
    "implementedInterface" : "StaffManagement"
  } ]
} ];