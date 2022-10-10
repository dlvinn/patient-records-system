# patient-records-system

## A system to store in and view patient's records. ##

## Overview ##
A system for patient records that the hospital, doctors, and receptionists can use. The system has three views and interfaces the hospital’s view, the doctor’s view, and the receptionist’s view. The doctor can add a new patient and write the patient’s records, edit the records or remove them entirely if necessary. A doctor can only view and edit his own patient’s records. The receptionist can only view a part of the records that concern their job. The receptionists can view which patient is added by which doctor. The hospital can view all the data but can’t edit it. 

### Who is it for? ###
This system is primarily for hospitals. 

### What is required? ###
For Hardware
  * PC
For Software
  - Windows 10 or newer versions.

### Team ###
- Hakam Iqdam
- Dlvin Hafeez
- Alan Salam
- Banel Nathir

### Goals ###
- A system that is easy to use and fast to navigate .
- Easily find data and patient records.
- A secure and private way to save data.
- Eliminate the use of physical(paper) records that are impractical and wasteful.

### Functionality ###
Because the project has two levels (manager & Seller) the functionality of each one is different and in order to separate their functionality we need to log in:
1. LOG IN
   - Login type (hospital, doctor, receptionist).
   - Add ID.
   - Add password.
2. Doctor
   - Add new patient.
     * Name and Surname
     * Patient ID
     * Date of BIrth
     * Date of Admission
     * Doctor's id
     * Sex
     * Chief complaint
     * Duration
     * History
     * Vitals
     * INvestigation
     * Treatment
     * Recommendation
   - Remove patient.
   - Edit patient's records.
   - Search patients based on name.
3. Hospital
   - View oatient records.
   - Search patient records by name.
   - Search patient records by doctor.
   - Search patient records by illness.
4. Receptionist
   - View patient records (not all data is included).
   - Search patient records by name (not all data in included).
   - Search patient records by doctor (not all data in included).
   - Search patient records by illness (not all data in included).
  
### Accessibility ###
The system accessibility is divided into 3 parts (hospital, doctor, receptionist). Each with a different view depending on their role in the system.
  - Hospital
  - Doctor
  - Receptionist
  
### Language Used ###
  - Java

