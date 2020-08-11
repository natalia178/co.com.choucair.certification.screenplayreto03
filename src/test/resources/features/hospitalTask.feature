
@stories
Feature: Medical date management
  As a patient, I want to ask for a medical date by using the hospital administration system

  @scenario1
  Scenario: Doctor registration
    Given than Natalia need to register a new doctor
    When he fill the doctor registry form in the app
      | name    | lastname | phone      | docType     | docNumber |
      | Natalia  | Perez    | 1122334455 | Pasaportes  | 1010      |
    Then he verify that the screen show the mesage Datos guardados correctamente.

  @scenario2
  Scenario: Patient registration
    Given than Natalia add a new patient
    When he fill the patient registry form in the app
      | name    | lastname | phone      | docType     | docNumber | prepaid |
      | Natalia  | Perez    | 1122334455 | Pasaportes  | 1011      | si      |
    Then he verify that the screen show the mesage Datos guardados correctamente.

  @scenario3
  Scenario: Date registration
    Given than Natalia want to make a new date
    When he fill the date registry form in the app
      | date      | patientID | doctorID | observations                  |
      | 15/5/2020 | 1011      | 1010  | cita agendada automaticamente |
    Then he verify that the screen show the mesage Datos guardados correctamente.