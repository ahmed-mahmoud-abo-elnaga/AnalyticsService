# Analytics Service

Analytics is a core part of every mobile app. In this exercise you are required to build a service
which can own the analytics part of the system.

## Scope

Service should be able to own the entity part which includes all the events name and
properties, own the business functionality/logic part of the analytics, and to have access to the
analytics platforms/tools but not necessarily own each platform/tool implementation.

## Supported Platforms
`Firebase`, `Adjust`, `CleverTap`, `Flurry`

## Business Requirements
Service should have the ability to log an event to all the supported platforms.

## Sample Example:
We need to log an event when the user selects a timeslot.
Name: "user-selected-timeslot"
Properties: ```json {slot-from: "10:00", slot-to: "10:30"}  ``` //Date Format: "HH:mm"
Trigger: ```kotlin didSelectTimeslot(timeslot: Timeslot) {}  ``` // Timeslot [from: Date, to: Date]


## Extended Requirements
1- We need our service to be able to attribute user details (email and phone) so we can be
able attach the events to the user, given that this functionality is only supported in
`Firebase` and `CleverTap`.

2- Some of our events will be screen-based, which is a normal event but only triggered
when the screen loads, the difference is that these events should be logged only to
`Flurry`
