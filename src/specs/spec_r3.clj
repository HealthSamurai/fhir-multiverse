(ns specs.spec-r3
  (:require [clojure.string :as string]
            [clojure.spec.alpha :as s]))
;; Primitive Type unsignedInt
(s/def ::unsignedInt int?)
;; Primitive Type markdown
(s/def ::markdown string?)
;; Primitive Type date
(s/def ::date string?)
;; Primitive Type instant
(s/def ::instant string?)
;; Primitive Type time
(s/def ::time string?)
;; Primitive Type base64Binary
(s/def ::base64Binary string?)
;; Primitive Type string
(s/def ::string string?)
;; Primitive Type dateTime
(s/def ::dateTime string?)
;; Primitive Type integer
(s/def ::integer int?)
;; Primitive Type oid
(s/def ::oid string?)
;; Primitive Type decimal
(s/def ::decimal string?)
;; Primitive Type id
(s/def ::id string?)
;; Primitive Type code
(s/def ::code string?)
;; Primitive Type positiveInt
(s/def ::positiveInt string?)
;; Primitive Type uri
(s/def ::uri string?)
;; Primitive Type uuid
(s/def ::uuid string?)
;; Primitive Type xhtml
(s/def ::xhtml string?)
;; Primitive Type boolean
(s/def ::boolean boolean?)

;; ProcedureRequest

(s/def ::ProcedureRequest
  (s/keys :req [:ProcedureRequest/intent :ProcedureRequest/status :ProcedureRequest/subject :ProcedureRequest/code]
          :opt [:ProcedureRequest/id :ProcedureRequest/note :ProcedureRequest/text :ProcedureRequest/relevantHistory :ProcedureRequest/authoredOn :ProcedureRequest/doNotPerform :ProcedureRequest/priority :ProcedureRequest/definition :ProcedureRequest/performer :ProcedureRequest/identifier :ProcedureRequest/reasonReference :ProcedureRequest/bodySite :ProcedureRequest/reasonCode :ProcedureRequest/implicitRules :ProcedureRequest/language :ProcedureRequest/contained :ProcedureRequest/replaces :ProcedureRequest/meta :ProcedureRequest/performerType :ProcedureRequest/specimen :ProcedureRequest/asNeeded :ProcedureRequest/category :ProcedureRequest/supportingInfo :ProcedureRequest/occurrence :ProcedureRequest/requisition :ProcedureRequest/basedOn :ProcedureRequest/context :ProcedureRequest/requester]))

;; DeviceRequest

(s/def ::DeviceRequest
  (s/keys :req [:DeviceRequest/intent :DeviceRequest/subject]
          :opt [:DeviceRequest/priorRequest :DeviceRequest/reasonReference :DeviceRequest/authoredOn :DeviceRequest/text :DeviceRequest/definition :DeviceRequest/performerType :DeviceRequest/supportingInfo :DeviceRequest/id :DeviceRequest/basedOn :DeviceRequest/relevantHistory :DeviceRequest/language :DeviceRequest/code :DeviceRequest/requester :DeviceRequest/status :DeviceRequest/note :DeviceRequest/identifier :DeviceRequest/context :DeviceRequest/contained :DeviceRequest/groupIdentifier :DeviceRequest/implicitRules :DeviceRequest/meta :DeviceRequest/occurrence :DeviceRequest/priority :DeviceRequest/reasonCode :DeviceRequest/performer]))

;; DeviceComponent

(s/def ::DeviceComponent
  (s/keys :req [:DeviceComponent/type :DeviceComponent/identifier]
          :opt [:DeviceComponent/lastSystemChange :DeviceComponent/language :DeviceComponent/contained :DeviceComponent/parameterGroup :DeviceComponent/languageCode :DeviceComponent/meta :DeviceComponent/operationalStatus :DeviceComponent/productionSpecification :DeviceComponent/parent :DeviceComponent/measurementPrinciple :DeviceComponent/implicitRules :DeviceComponent/text :DeviceComponent/id :DeviceComponent/source]))

;; DeviceMetric

(s/def ::DeviceMetric
  (s/keys :req [:DeviceMetric/type :DeviceMetric/identifier :DeviceMetric/category]
          :opt [:DeviceMetric/id :DeviceMetric/unit :DeviceMetric/text :DeviceMetric/parent :DeviceMetric/color :DeviceMetric/source :DeviceMetric/operationalStatus :DeviceMetric/implicitRules :DeviceMetric/measurementPeriod :DeviceMetric/calibration :DeviceMetric/language :DeviceMetric/contained :DeviceMetric/meta]))

;; CarePlan

(s/def ::CarePlan
  (s/keys :req [:CarePlan/subject :CarePlan/intent :CarePlan/status]
          :opt [:CarePlan/definition :CarePlan/period :CarePlan/context :CarePlan/replaces :CarePlan/text :CarePlan/basedOn :CarePlan/author :CarePlan/supportingInfo :CarePlan/addresses :CarePlan/description :CarePlan/id :CarePlan/meta :CarePlan/title :CarePlan/identifier :CarePlan/activity :CarePlan/implicitRules :CarePlan/note :CarePlan/category :CarePlan/contained :CarePlan/language :CarePlan/goal :CarePlan/careTeam :CarePlan/partOf]))

;; Observation

(s/def ::Observation
  (s/keys :req [:Observation/code :Observation/status]
          :opt [:Observation/language :Observation/text :Observation/method :Observation/dataAbsentReason :Observation/subject :Observation/basedOn :Observation/specimen :Observation/value :Observation/referenceRange :Observation/id :Observation/issued :Observation/interpretation :Observation/identifier :Observation/performer :Observation/contained :Observation/meta :Observation/implicitRules :Observation/related :Observation/device :Observation/effective :Observation/component :Observation/category :Observation/comment :Observation/bodySite :Observation/context]))

;; EnrollmentRequest

(s/def ::EnrollmentRequest
  (s/keys :req []
          :opt [:EnrollmentRequest/subject :EnrollmentRequest/language :EnrollmentRequest/identifier :EnrollmentRequest/provider :EnrollmentRequest/meta :EnrollmentRequest/id :EnrollmentRequest/contained :EnrollmentRequest/status :EnrollmentRequest/implicitRules :EnrollmentRequest/coverage :EnrollmentRequest/insurer :EnrollmentRequest/organization :EnrollmentRequest/text :EnrollmentRequest/created]))

;; Group

(s/def ::Group
  (s/keys :req [:Group/type :Group/actual]
          :opt [:Group/characteristic :Group/text :Group/member :Group/implicitRules :Group/contained :Group/id :Group/identifier :Group/language :Group/active :Group/code :Group/name :Group/quantity :Group/meta]))

;; MessageDefinition

(s/def ::MessageDefinition
  (s/keys :req [:MessageDefinition/status :MessageDefinition/date :MessageDefinition/event]
          :opt [:MessageDefinition/contact :MessageDefinition/useContext :MessageDefinition/jurisdiction :MessageDefinition/replaces :MessageDefinition/purpose :MessageDefinition/experimental :MessageDefinition/title :MessageDefinition/base :MessageDefinition/name :MessageDefinition/publisher :MessageDefinition/id :MessageDefinition/category :MessageDefinition/focus :MessageDefinition/implicitRules :MessageDefinition/text :MessageDefinition/language :MessageDefinition/version :MessageDefinition/copyright :MessageDefinition/parent :MessageDefinition/identifier :MessageDefinition/allowedResponse :MessageDefinition/contained :MessageDefinition/description :MessageDefinition/url :MessageDefinition/meta :MessageDefinition/responseRequired]))

;; ReferralRequest

(s/def ::ReferralRequest
  (s/keys :req [:ReferralRequest/status :ReferralRequest/subject :ReferralRequest/intent]
          :opt [:ReferralRequest/basedOn :ReferralRequest/specialty :ReferralRequest/reasonReference :ReferralRequest/requester :ReferralRequest/serviceRequested :ReferralRequest/note :ReferralRequest/description :ReferralRequest/id :ReferralRequest/replaces :ReferralRequest/meta :ReferralRequest/recipient :ReferralRequest/language :ReferralRequest/occurrence :ReferralRequest/implicitRules :ReferralRequest/definition :ReferralRequest/context :ReferralRequest/priority :ReferralRequest/identifier :ReferralRequest/groupIdentifier :ReferralRequest/contained :ReferralRequest/authoredOn :ReferralRequest/reasonCode :ReferralRequest/supportingInfo :ReferralRequest/relevantHistory :ReferralRequest/type :ReferralRequest/text]))

;; Appointment

(s/def ::Appointment
  (s/keys :req [:Appointment/participant :Appointment/status]
          :opt [:Appointment/priority :Appointment/implicitRules :Appointment/language :Appointment/end :Appointment/start :Appointment/reason :Appointment/text :Appointment/serviceCategory :Appointment/serviceType :Appointment/specialty :Appointment/indication :Appointment/contained :Appointment/identifier :Appointment/description :Appointment/requestedPeriod :Appointment/appointmentType :Appointment/comment :Appointment/created :Appointment/id :Appointment/incomingReferral :Appointment/minutesDuration :Appointment/supportingInformation :Appointment/slot :Appointment/meta]))

;; QuestionnaireResponse

(s/def ::QuestionnaireResponse
  (s/keys :req [:QuestionnaireResponse/status]
          :opt [:QuestionnaireResponse/text :QuestionnaireResponse/contained :QuestionnaireResponse/language :QuestionnaireResponse/context :QuestionnaireResponse/subject :QuestionnaireResponse/authored :QuestionnaireResponse/identifier :QuestionnaireResponse/source :QuestionnaireResponse/id :QuestionnaireResponse/item :QuestionnaireResponse/basedOn :QuestionnaireResponse/meta :QuestionnaireResponse/implicitRules :QuestionnaireResponse/parent :QuestionnaireResponse/author :QuestionnaireResponse/questionnaire]))

;; EpisodeOfCare

(s/def ::EpisodeOfCare
  (s/keys :req [:EpisodeOfCare/patient :EpisodeOfCare/status]
          :opt [:EpisodeOfCare/implicitRules :EpisodeOfCare/id :EpisodeOfCare/careManager :EpisodeOfCare/meta :EpisodeOfCare/period :EpisodeOfCare/account :EpisodeOfCare/identifier :EpisodeOfCare/managingOrganization :EpisodeOfCare/team :EpisodeOfCare/diagnosis :EpisodeOfCare/type :EpisodeOfCare/referralRequest :EpisodeOfCare/contained :EpisodeOfCare/language :EpisodeOfCare/text :EpisodeOfCare/statusHistory]))

;; ProcessResponse

(s/def ::ProcessResponse
  (s/keys :req []
          :opt [:ProcessResponse/requestOrganization :ProcessResponse/meta :ProcessResponse/form :ProcessResponse/error :ProcessResponse/identifier :ProcessResponse/disposition :ProcessResponse/outcome :ProcessResponse/processNote :ProcessResponse/id :ProcessResponse/requestProvider :ProcessResponse/organization :ProcessResponse/status :ProcessResponse/text :ProcessResponse/request :ProcessResponse/language :ProcessResponse/implicitRules :ProcessResponse/created :ProcessResponse/communicationRequest :ProcessResponse/contained]))

;; SupplyDelivery

(s/def ::SupplyDelivery
  (s/keys :req []
          :opt [:SupplyDelivery/suppliedItem :SupplyDelivery/status :SupplyDelivery/occurrence :SupplyDelivery/type :SupplyDelivery/implicitRules :SupplyDelivery/identifier :SupplyDelivery/text :SupplyDelivery/id :SupplyDelivery/meta :SupplyDelivery/receiver :SupplyDelivery/contained :SupplyDelivery/language :SupplyDelivery/destination :SupplyDelivery/partOf :SupplyDelivery/supplier :SupplyDelivery/basedOn :SupplyDelivery/patient]))

;; AdverseEvent

(s/def ::AdverseEvent
  (s/keys :req []
          :opt [:AdverseEvent/description :AdverseEvent/text :AdverseEvent/reaction :AdverseEvent/meta :AdverseEvent/category :AdverseEvent/referenceDocument :AdverseEvent/suspectEntity :AdverseEvent/recorder :AdverseEvent/implicitRules :AdverseEvent/id :AdverseEvent/outcome :AdverseEvent/contained :AdverseEvent/seriousness :AdverseEvent/type :AdverseEvent/location :AdverseEvent/identifier :AdverseEvent/date :AdverseEvent/language :AdverseEvent/subject :AdverseEvent/subjectMedicalHistory :AdverseEvent/eventParticipant :AdverseEvent/study]))

;; Endpoint

(s/def ::Endpoint
  (s/keys :req [:Endpoint/connectionType :Endpoint/payloadType :Endpoint/address :Endpoint/status]
          :opt [:Endpoint/contained :Endpoint/language :Endpoint/implicitRules :Endpoint/managingOrganization :Endpoint/name :Endpoint/contact :Endpoint/id :Endpoint/text :Endpoint/payloadMimeType :Endpoint/identifier :Endpoint/period :Endpoint/meta :Endpoint/header]))

;; CompartmentDefinition

(s/def ::CompartmentDefinition
  (s/keys :req [:CompartmentDefinition/name :CompartmentDefinition/url :CompartmentDefinition/search :CompartmentDefinition/status :CompartmentDefinition/code]
          :opt [:CompartmentDefinition/useContext :CompartmentDefinition/purpose :CompartmentDefinition/description :CompartmentDefinition/text :CompartmentDefinition/resource :CompartmentDefinition/contained :CompartmentDefinition/contact :CompartmentDefinition/title :CompartmentDefinition/language :CompartmentDefinition/implicitRules :CompartmentDefinition/jurisdiction :CompartmentDefinition/publisher :CompartmentDefinition/experimental :CompartmentDefinition/date :CompartmentDefinition/meta :CompartmentDefinition/id]))

;; DetectedIssue

(s/def ::DetectedIssue
  (s/keys :req [:DetectedIssue/status]
          :opt [:DetectedIssue/category :DetectedIssue/language :DetectedIssue/implicitRules :DetectedIssue/patient :DetectedIssue/contained :DetectedIssue/author :DetectedIssue/mitigation :DetectedIssue/text :DetectedIssue/reference :DetectedIssue/meta :DetectedIssue/id :DetectedIssue/detail :DetectedIssue/severity :DetectedIssue/date :DetectedIssue/identifier :DetectedIssue/implicated]))

;; MedicationAdministration

(s/def ::MedicationAdministration
  (s/keys :req [:MedicationAdministration/status :MedicationAdministration/subject]
          :opt [:MedicationAdministration/reasonNotGiven :MedicationAdministration/partOf :MedicationAdministration/implicitRules :MedicationAdministration/performer :MedicationAdministration/reasonCode :MedicationAdministration/notGiven :MedicationAdministration/reasonReference :MedicationAdministration/context :MedicationAdministration/device :MedicationAdministration/meta :MedicationAdministration/identifier :MedicationAdministration/prescription :MedicationAdministration/eventHistory :MedicationAdministration/text :MedicationAdministration/effective :MedicationAdministration/medication :MedicationAdministration/category :MedicationAdministration/supportingInformation :MedicationAdministration/contained :MedicationAdministration/id :MedicationAdministration/definition :MedicationAdministration/note :MedicationAdministration/language :MedicationAdministration/dosage]))

;; ImplementationGuide

(s/def ::ImplementationGuide
  (s/keys :req [:ImplementationGuide/name :ImplementationGuide/url :ImplementationGuide/status]
          :opt [:ImplementationGuide/jurisdiction :ImplementationGuide/publisher :ImplementationGuide/fhirVersion :ImplementationGuide/dependency :ImplementationGuide/copyright :ImplementationGuide/description :ImplementationGuide/contained :ImplementationGuide/experimental :ImplementationGuide/date :ImplementationGuide/language :ImplementationGuide/id :ImplementationGuide/text :ImplementationGuide/page :ImplementationGuide/contact :ImplementationGuide/useContext :ImplementationGuide/version :ImplementationGuide/package :ImplementationGuide/global :ImplementationGuide/implicitRules :ImplementationGuide/meta :ImplementationGuide/binary]))

;; Goal

(s/def ::Goal
  (s/keys :req [:Goal/status :Goal/description]
          :opt [:Goal/identifier :Goal/outcomeCode :Goal/addresses :Goal/expressedBy :Goal/note :Goal/outcomeReference :Goal/statusDate :Goal/statusReason :Goal/start :Goal/target :Goal/contained :Goal/category :Goal/language :Goal/priority :Goal/subject :Goal/implicitRules :Goal/text :Goal/id :Goal/meta]))

;; Communication

(s/def ::Communication
  (s/keys :req [:Communication/status]
          :opt [:Communication/notDoneReason :Communication/implicitRules :Communication/subject :Communication/contained :Communication/topic :Communication/medium :Communication/partOf :Communication/meta :Communication/reasonCode :Communication/identifier :Communication/definition :Communication/reasonReference :Communication/notDone :Communication/received :Communication/language :Communication/recipient :Communication/category :Communication/text :Communication/payload :Communication/note :Communication/sent :Communication/basedOn :Communication/sender :Communication/context :Communication/id]))

;; Schedule

(s/def ::Schedule
  (s/keys :req [:Schedule/actor]
          :opt [:Schedule/id :Schedule/contained :Schedule/serviceType :Schedule/meta :Schedule/identifier :Schedule/language :Schedule/active :Schedule/serviceCategory :Schedule/planningHorizon :Schedule/implicitRules :Schedule/specialty :Schedule/comment :Schedule/text]))

;; DocumentReference

(s/def ::DocumentReference
  (s/keys :req [:DocumentReference/content :DocumentReference/status :DocumentReference/indexed :DocumentReference/type]
          :opt [:DocumentReference/created :DocumentReference/meta :DocumentReference/authenticator :DocumentReference/contained :DocumentReference/description :DocumentReference/language :DocumentReference/subject :DocumentReference/context :DocumentReference/implicitRules :DocumentReference/identifier :DocumentReference/relatesTo :DocumentReference/text :DocumentReference/class :DocumentReference/id :DocumentReference/securityLabel :DocumentReference/custodian :DocumentReference/docStatus :DocumentReference/author :DocumentReference/masterIdentifier]))

;; Coverage

(s/def ::Coverage
  (s/keys :req []
          :opt [:Coverage/payor :Coverage/policyHolder :Coverage/relationship :Coverage/type :Coverage/sequence :Coverage/language :Coverage/dependent :Coverage/beneficiary :Coverage/subscriber :Coverage/contract :Coverage/text :Coverage/meta :Coverage/grouping :Coverage/implicitRules :Coverage/contained :Coverage/network :Coverage/subscriberId :Coverage/order :Coverage/id :Coverage/identifier :Coverage/period :Coverage/status]))

;; AuditEvent

(s/def ::AuditEvent
  (s/keys :req [:AuditEvent/agent :AuditEvent/recorded :AuditEvent/type :AuditEvent/source]
          :opt [:AuditEvent/implicitRules :AuditEvent/outcomeDesc :AuditEvent/entity :AuditEvent/subtype :AuditEvent/text :AuditEvent/outcome :AuditEvent/meta :AuditEvent/purposeOfEvent :AuditEvent/language :AuditEvent/id :AuditEvent/contained :AuditEvent/action]))

;; MessageHeader

(s/def ::MessageHeader
  (s/keys :req [:MessageHeader/source :MessageHeader/event :MessageHeader/timestamp]
          :opt [:MessageHeader/enterer :MessageHeader/author :MessageHeader/id :MessageHeader/focus :MessageHeader/contained :MessageHeader/implicitRules :MessageHeader/text :MessageHeader/sender :MessageHeader/response :MessageHeader/receiver :MessageHeader/reason :MessageHeader/destination :MessageHeader/meta :MessageHeader/language :MessageHeader/responsible]))

;; Contract

(s/def ::Contract
  (s/keys :req []
          :opt [:Contract/issued :Contract/contained :Contract/applies :Contract/meta :Contract/agent :Contract/type :Contract/friendly :Contract/id :Contract/text :Contract/actionReason :Contract/signer :Contract/binding :Contract/legal :Contract/rule :Contract/language :Contract/securityLabel :Contract/subType :Contract/decisionType :Contract/implicitRules :Contract/domain :Contract/valuedItem :Contract/subject :Contract/identifier :Contract/status :Contract/topic :Contract/contentDerivative :Contract/action :Contract/authority :Contract/term]))

;; Sequence

(s/def ::Sequence
  (s/keys :req [:Sequence/coordinateSystem]
          :opt [:Sequence/type :Sequence/device :Sequence/observedSeq :Sequence/readCoverage :Sequence/meta :Sequence/quality :Sequence/referenceSeq :Sequence/variant :Sequence/contained :Sequence/identifier :Sequence/repository :Sequence/quantity :Sequence/text :Sequence/id :Sequence/patient :Sequence/performer :Sequence/specimen :Sequence/language :Sequence/implicitRules :Sequence/pointer]))

;; DataElement

(s/def ::DataElement
  (s/keys :req [:DataElement/status :DataElement/element]
          :opt [:DataElement/id :DataElement/useContext :DataElement/text :DataElement/stringency :DataElement/contact :DataElement/implicitRules :DataElement/jurisdiction :DataElement/publisher :DataElement/url :DataElement/meta :DataElement/version :DataElement/language :DataElement/mapping :DataElement/title :DataElement/date :DataElement/contained :DataElement/name :DataElement/copyright :DataElement/experimental :DataElement/identifier]))

;; CodeSystem

(s/def ::CodeSystem
  (s/keys :req [:CodeSystem/content :CodeSystem/status]
          :opt [:CodeSystem/compositional :CodeSystem/publisher :CodeSystem/count :CodeSystem/purpose :CodeSystem/url :CodeSystem/experimental :CodeSystem/copyright :CodeSystem/versionNeeded :CodeSystem/contained :CodeSystem/title :CodeSystem/implicitRules :CodeSystem/caseSensitive :CodeSystem/identifier :CodeSystem/id :CodeSystem/filter :CodeSystem/description :CodeSystem/version :CodeSystem/concept :CodeSystem/useContext :CodeSystem/contact :CodeSystem/property :CodeSystem/jurisdiction :CodeSystem/language :CodeSystem/text :CodeSystem/valueSet :CodeSystem/meta :CodeSystem/hierarchyMeaning :CodeSystem/date :CodeSystem/name]))

;; PlanDefinition

(s/def ::PlanDefinition
  (s/keys :req [:PlanDefinition/status]
          :opt [:PlanDefinition/lastReviewDate :PlanDefinition/type :PlanDefinition/usage :PlanDefinition/text :PlanDefinition/date :PlanDefinition/id :PlanDefinition/relatedArtifact :PlanDefinition/language :PlanDefinition/url :PlanDefinition/useContext :PlanDefinition/implicitRules :PlanDefinition/copyright :PlanDefinition/effectivePeriod :PlanDefinition/title :PlanDefinition/topic :PlanDefinition/meta :PlanDefinition/jurisdiction :PlanDefinition/identifier :PlanDefinition/action :PlanDefinition/contributor :PlanDefinition/name :PlanDefinition/contact :PlanDefinition/goal :PlanDefinition/publisher :PlanDefinition/version :PlanDefinition/library :PlanDefinition/purpose :PlanDefinition/experimental :PlanDefinition/description :PlanDefinition/contained :PlanDefinition/approvalDate]))

;; ClaimResponse

(s/def ::ClaimResponse
  (s/keys :req []
          :opt [:ClaimResponse/request :ClaimResponse/identifier :ClaimResponse/totalCost :ClaimResponse/requestProvider :ClaimResponse/communicationRequest :ClaimResponse/text :ClaimResponse/reserved :ClaimResponse/status :ClaimResponse/outcome :ClaimResponse/payeeType :ClaimResponse/id :ClaimResponse/form :ClaimResponse/language :ClaimResponse/totalBenefit :ClaimResponse/payment :ClaimResponse/item :ClaimResponse/created :ClaimResponse/processNote :ClaimResponse/patient :ClaimResponse/addItem :ClaimResponse/contained :ClaimResponse/error :ClaimResponse/implicitRules :ClaimResponse/requestOrganization :ClaimResponse/unallocDeductable :ClaimResponse/disposition :ClaimResponse/insurance :ClaimResponse/insurer :ClaimResponse/meta]))

;; ChargeItem

(s/def ::ChargeItem
  (s/keys :req [:ChargeItem/status :ChargeItem/code :ChargeItem/subject]
          :opt [:ChargeItem/meta :ChargeItem/quantity :ChargeItem/service :ChargeItem/overrideReason :ChargeItem/factorOverride :ChargeItem/partOf :ChargeItem/identifier :ChargeItem/bodysite :ChargeItem/priceOverride :ChargeItem/occurrence :ChargeItem/enteredDate :ChargeItem/requestingOrganization :ChargeItem/account :ChargeItem/id :ChargeItem/implicitRules :ChargeItem/context :ChargeItem/supportingInformation :ChargeItem/enterer :ChargeItem/definition :ChargeItem/note :ChargeItem/text :ChargeItem/language :ChargeItem/contained :ChargeItem/participant :ChargeItem/performingOrganization :ChargeItem/reason]))

;; Parameters

(s/def ::Parameters
  (s/keys :req []
          :opt [:Parameters/parameter :Parameters/id :Parameters/meta :Parameters/implicitRules :Parameters/language]))

;; ClinicalImpression

(s/def ::ClinicalImpression
  (s/keys :req [:ClinicalImpression/status :ClinicalImpression/subject]
          :opt [:ClinicalImpression/assessor :ClinicalImpression/effective :ClinicalImpression/date :ClinicalImpression/context :ClinicalImpression/protocol :ClinicalImpression/contained :ClinicalImpression/identifier :ClinicalImpression/meta :ClinicalImpression/finding :ClinicalImpression/note :ClinicalImpression/id :ClinicalImpression/summary :ClinicalImpression/problem :ClinicalImpression/investigation :ClinicalImpression/text :ClinicalImpression/action :ClinicalImpression/previous :ClinicalImpression/prognosisReference :ClinicalImpression/language :ClinicalImpression/implicitRules :ClinicalImpression/description :ClinicalImpression/prognosisCodeableConcept :ClinicalImpression/code]))

;; FamilyMemberHistory

(s/def ::FamilyMemberHistory
  (s/keys :req [:FamilyMemberHistory/relationship :FamilyMemberHistory/patient :FamilyMemberHistory/status]
          :opt [:FamilyMemberHistory/notDoneReason :FamilyMemberHistory/deceased :FamilyMemberHistory/note :FamilyMemberHistory/estimatedAge :FamilyMemberHistory/implicitRules :FamilyMemberHistory/reasonReference :FamilyMemberHistory/name :FamilyMemberHistory/notDone :FamilyMemberHistory/age :FamilyMemberHistory/date :FamilyMemberHistory/id :FamilyMemberHistory/born :FamilyMemberHistory/reasonCode :FamilyMemberHistory/language :FamilyMemberHistory/text :FamilyMemberHistory/contained :FamilyMemberHistory/definition :FamilyMemberHistory/condition :FamilyMemberHistory/gender :FamilyMemberHistory/identifier :FamilyMemberHistory/meta]))

;; Binary

(s/def ::Binary
  (s/keys :req [:Binary/content :Binary/contentType]
          :opt [:Binary/id :Binary/language :Binary/securityContext :Binary/implicitRules :Binary/meta]))

;; Composition

(s/def ::Composition
  (s/keys :req [:Composition/status :Composition/subject :Composition/type :Composition/date :Composition/author :Composition/title]
          :opt [:Composition/confidentiality :Composition/text :Composition/meta :Composition/section :Composition/implicitRules :Composition/event :Composition/contained :Composition/relatesTo :Composition/id :Composition/identifier :Composition/custodian :Composition/language :Composition/attester :Composition/class :Composition/encounter]))

;; PractitionerRole

(s/def ::PractitionerRole
  (s/keys :req []
          :opt [:PractitionerRole/implicitRules :PractitionerRole/endpoint :PractitionerRole/contained :PractitionerRole/meta :PractitionerRole/healthcareService :PractitionerRole/text :PractitionerRole/organization :PractitionerRole/notAvailable :PractitionerRole/active :PractitionerRole/language :PractitionerRole/code :PractitionerRole/availableTime :PractitionerRole/period :PractitionerRole/practitioner :PractitionerRole/identifier :PractitionerRole/specialty :PractitionerRole/availabilityExceptions :PractitionerRole/location :PractitionerRole/id :PractitionerRole/telecom]))

;; HealthcareService

(s/def ::HealthcareService
  (s/keys :req []
          :opt [:HealthcareService/active :HealthcareService/id :HealthcareService/providedBy :HealthcareService/availabilityExceptions :HealthcareService/location :HealthcareService/referralMethod :HealthcareService/endpoint :HealthcareService/coverageArea :HealthcareService/implicitRules :HealthcareService/availableTime :HealthcareService/language :HealthcareService/extraDetails :HealthcareService/eligibilityNote :HealthcareService/comment :HealthcareService/appointmentRequired :HealthcareService/contained :HealthcareService/notAvailable :HealthcareService/photo :HealthcareService/serviceProvisionCode :HealthcareService/programName :HealthcareService/meta :HealthcareService/eligibility :HealthcareService/identifier :HealthcareService/type :HealthcareService/text :HealthcareService/characteristic :HealthcareService/category :HealthcareService/specialty :HealthcareService/name :HealthcareService/telecom]))

;; Patient

(s/def ::Patient
  (s/keys :req []
          :opt [:Patient/deceased :Patient/active :Patient/contained :Patient/maritalStatus :Patient/gender :Patient/text :Patient/name :Patient/telecom :Patient/identifier :Patient/managingOrganization :Patient/photo :Patient/generalPractitioner :Patient/link :Patient/animal :Patient/birthDate :Patient/language :Patient/communication :Patient/id :Patient/multipleBirth :Patient/meta :Patient/address :Patient/implicitRules :Patient/contact]))

;; MedicationDispense

(s/def ::MedicationDispense
  (s/keys :req []
          :opt [:MedicationDispense/text :MedicationDispense/whenHandedOver :MedicationDispense/contained :MedicationDispense/subject :MedicationDispense/category :MedicationDispense/id :MedicationDispense/identifier :MedicationDispense/supportingInformation :MedicationDispense/detectedIssue :MedicationDispense/receiver :MedicationDispense/destination :MedicationDispense/note :MedicationDispense/daysSupply :MedicationDispense/type :MedicationDispense/notDone :MedicationDispense/meta :MedicationDispense/medication :MedicationDispense/performer :MedicationDispense/language :MedicationDispense/partOf :MedicationDispense/status :MedicationDispense/quantity :MedicationDispense/notDoneReason :MedicationDispense/substitution :MedicationDispense/whenPrepared :MedicationDispense/implicitRules :MedicationDispense/authorizingPrescription :MedicationDispense/dosageInstruction :MedicationDispense/eventHistory :MedicationDispense/context]))

;; DeviceUseStatement

(s/def ::DeviceUseStatement
  (s/keys :req [:DeviceUseStatement/status :DeviceUseStatement/subject :DeviceUseStatement/device]
          :opt [:DeviceUseStatement/timing :DeviceUseStatement/source :DeviceUseStatement/id :DeviceUseStatement/meta :DeviceUseStatement/note :DeviceUseStatement/implicitRules :DeviceUseStatement/identifier :DeviceUseStatement/recordedOn :DeviceUseStatement/bodySite :DeviceUseStatement/language :DeviceUseStatement/indication :DeviceUseStatement/text :DeviceUseStatement/whenUsed :DeviceUseStatement/contained]))

;; StructureMap

(s/def ::StructureMap
  (s/keys :req [:StructureMap/status :StructureMap/name :StructureMap/url :StructureMap/group]
          :opt [:StructureMap/jurisdiction :StructureMap/text :StructureMap/experimental :StructureMap/title :StructureMap/meta :StructureMap/purpose :StructureMap/description :StructureMap/import :StructureMap/contact :StructureMap/date :StructureMap/identifier :StructureMap/structure :StructureMap/language :StructureMap/contained :StructureMap/copyright :StructureMap/version :StructureMap/publisher :StructureMap/implicitRules :StructureMap/id :StructureMap/useContext]))

;; Library

(s/def ::Library
  (s/keys :req [:Library/type :Library/status]
          :opt [:Library/jurisdiction :Library/identifier :Library/topic :Library/purpose :Library/date :Library/id :Library/description :Library/dataRequirement :Library/parameter :Library/meta :Library/copyright :Library/version :Library/publisher :Library/useContext :Library/text :Library/lastReviewDate :Library/title :Library/relatedArtifact :Library/language :Library/content :Library/contained :Library/effectivePeriod :Library/usage :Library/implicitRules :Library/name :Library/contributor :Library/experimental :Library/url :Library/approvalDate :Library/contact]))

;; Basic

(s/def ::Basic
  (s/keys :req [:Basic/code]
          :opt [:Basic/text :Basic/identifier :Basic/language :Basic/author :Basic/implicitRules :Basic/created :Basic/meta :Basic/id :Basic/contained :Basic/subject]))

;; Slot

(s/def ::Slot
  (s/keys :req [:Slot/status :Slot/end :Slot/schedule :Slot/start]
          :opt [:Slot/text :Slot/overbooked :Slot/identifier :Slot/comment :Slot/appointmentType :Slot/contained :Slot/id :Slot/specialty :Slot/implicitRules :Slot/serviceType :Slot/meta :Slot/language :Slot/serviceCategory]))

;; ActivityDefinition

(s/def ::ActivityDefinition
  (s/keys :req [:ActivityDefinition/status]
          :opt [:ActivityDefinition/description :ActivityDefinition/location :ActivityDefinition/url :ActivityDefinition/experimental :ActivityDefinition/topic :ActivityDefinition/relatedArtifact :ActivityDefinition/timing :ActivityDefinition/product :ActivityDefinition/jurisdiction :ActivityDefinition/kind :ActivityDefinition/useContext :ActivityDefinition/identifier :ActivityDefinition/effectivePeriod :ActivityDefinition/contributor :ActivityDefinition/text :ActivityDefinition/implicitRules :ActivityDefinition/bodySite :ActivityDefinition/title :ActivityDefinition/name :ActivityDefinition/quantity :ActivityDefinition/dosage :ActivityDefinition/approvalDate :ActivityDefinition/participant :ActivityDefinition/code :ActivityDefinition/contained :ActivityDefinition/copyright :ActivityDefinition/meta :ActivityDefinition/language :ActivityDefinition/purpose :ActivityDefinition/library :ActivityDefinition/version :ActivityDefinition/transform :ActivityDefinition/date :ActivityDefinition/publisher :ActivityDefinition/id :ActivityDefinition/lastReviewDate :ActivityDefinition/dynamicValue :ActivityDefinition/usage :ActivityDefinition/contact]))

;; Specimen

(s/def ::Specimen
  (s/keys :req [:Specimen/subject]
          :opt [:Specimen/processing :Specimen/collection :Specimen/request :Specimen/type :Specimen/parent :Specimen/contained :Specimen/accessionIdentifier :Specimen/id :Specimen/container :Specimen/receivedTime :Specimen/identifier :Specimen/language :Specimen/status :Specimen/text :Specimen/meta :Specimen/implicitRules :Specimen/note]))

;; DiagnosticReport

(s/def ::DiagnosticReport
  (s/keys :req [:DiagnosticReport/code :DiagnosticReport/status]
          :opt [:DiagnosticReport/subject :DiagnosticReport/conclusion :DiagnosticReport/identifier :DiagnosticReport/result :DiagnosticReport/codedDiagnosis :DiagnosticReport/meta :DiagnosticReport/contained :DiagnosticReport/basedOn :DiagnosticReport/performer :DiagnosticReport/image :DiagnosticReport/implicitRules :DiagnosticReport/imagingStudy :DiagnosticReport/id :DiagnosticReport/context :DiagnosticReport/text :DiagnosticReport/category :DiagnosticReport/presentedForm :DiagnosticReport/language :DiagnosticReport/effective :DiagnosticReport/issued :DiagnosticReport/specimen]))

;; Subscription

(s/def ::Subscription
  (s/keys :req [:Subscription/channel :Subscription/reason :Subscription/status :Subscription/criteria]
          :opt [:Subscription/contained :Subscription/meta :Subscription/error :Subscription/tag :Subscription/language :Subscription/implicitRules :Subscription/id :Subscription/end :Subscription/contact :Subscription/text]))

;; RequestGroup

(s/def ::RequestGroup
  (s/keys :req [:RequestGroup/status :RequestGroup/intent]
          :opt [:RequestGroup/identifier :RequestGroup/language :RequestGroup/id :RequestGroup/note :RequestGroup/meta :RequestGroup/reason :RequestGroup/action :RequestGroup/context :RequestGroup/subject :RequestGroup/authoredOn :RequestGroup/priority :RequestGroup/author :RequestGroup/definition :RequestGroup/groupIdentifier :RequestGroup/replaces :RequestGroup/implicitRules :RequestGroup/basedOn :RequestGroup/text :RequestGroup/contained]))

;; Provenance

(s/def ::Provenance
  (s/keys :req [:Provenance/target :Provenance/agent :Provenance/recorded]
          :opt [:Provenance/text :Provenance/language :Provenance/meta :Provenance/id :Provenance/signature :Provenance/entity :Provenance/policy :Provenance/implicitRules :Provenance/activity :Provenance/contained :Provenance/period :Provenance/reason :Provenance/location]))

;; Practitioner

(s/def ::Practitioner
  (s/keys :req []
          :opt [:Practitioner/identifier :Practitioner/contained :Practitioner/qualification :Practitioner/active :Practitioner/name :Practitioner/text :Practitioner/communication :Practitioner/telecom :Practitioner/birthDate :Practitioner/implicitRules :Practitioner/id :Practitioner/gender :Practitioner/language :Practitioner/address :Practitioner/meta :Practitioner/photo]))

;; Flag

(s/def ::Flag
  (s/keys :req [:Flag/subject :Flag/status :Flag/code]
          :opt [:Flag/contained :Flag/encounter :Flag/id :Flag/implicitRules :Flag/category :Flag/author :Flag/period :Flag/language :Flag/text :Flag/meta :Flag/identifier]))

;; ExplanationOfBenefit

(s/def ::ExplanationOfBenefit
  (s/keys :req []
          :opt [:ExplanationOfBenefit/benefitBalance :ExplanationOfBenefit/form :ExplanationOfBenefit/payee :ExplanationOfBenefit/diagnosis :ExplanationOfBenefit/hospitalization :ExplanationOfBenefit/information :ExplanationOfBenefit/accident :ExplanationOfBenefit/careTeam :ExplanationOfBenefit/enterer :ExplanationOfBenefit/language :ExplanationOfBenefit/insurer :ExplanationOfBenefit/type :ExplanationOfBenefit/facility :ExplanationOfBenefit/id :ExplanationOfBenefit/subType :ExplanationOfBenefit/processNote :ExplanationOfBenefit/organization :ExplanationOfBenefit/implicitRules :ExplanationOfBenefit/referral :ExplanationOfBenefit/precedence :ExplanationOfBenefit/insurance :ExplanationOfBenefit/payment :ExplanationOfBenefit/originalPrescription :ExplanationOfBenefit/related :ExplanationOfBenefit/unallocDeductable :ExplanationOfBenefit/outcome :ExplanationOfBenefit/totalBenefit :ExplanationOfBenefit/text :ExplanationOfBenefit/meta :ExplanationOfBenefit/contained :ExplanationOfBenefit/claimResponse :ExplanationOfBenefit/totalCost :ExplanationOfBenefit/procedure :ExplanationOfBenefit/identifier :ExplanationOfBenefit/created :ExplanationOfBenefit/prescription :ExplanationOfBenefit/addItem :ExplanationOfBenefit/provider :ExplanationOfBenefit/billablePeriod :ExplanationOfBenefit/status :ExplanationOfBenefit/employmentImpacted :ExplanationOfBenefit/claim :ExplanationOfBenefit/patient :ExplanationOfBenefit/disposition :ExplanationOfBenefit/item]))

;; Linkage

(s/def ::Linkage
  (s/keys :req [:Linkage/item]
          :opt [:Linkage/active :Linkage/language :Linkage/id :Linkage/author :Linkage/text :Linkage/contained :Linkage/meta :Linkage/implicitRules]))

;; OperationOutcome

(s/def ::OperationOutcome
  (s/keys :req [:OperationOutcome/issue]
          :opt [:OperationOutcome/implicitRules :OperationOutcome/language :OperationOutcome/contained :OperationOutcome/id :OperationOutcome/meta :OperationOutcome/text]))

;; Immunization

(s/def ::Immunization
  (s/keys :req [:Immunization/status :Immunization/patient :Immunization/notGiven :Immunization/vaccineCode :Immunization/primarySource]
          :opt [:Immunization/manufacturer :Immunization/location :Immunization/practitioner :Immunization/language :Immunization/reaction :Immunization/encounter :Immunization/text :Immunization/lotNumber :Immunization/contained :Immunization/reportOrigin :Immunization/vaccinationProtocol :Immunization/date :Immunization/explanation :Immunization/implicitRules :Immunization/expirationDate :Immunization/doseQuantity :Immunization/meta :Immunization/site :Immunization/identifier :Immunization/route :Immunization/id :Immunization/note]))

;; ResearchSubject

(s/def ::ResearchSubject
  (s/keys :req [:ResearchSubject/individual :ResearchSubject/study :ResearchSubject/status]
          :opt [:ResearchSubject/consent :ResearchSubject/language :ResearchSubject/meta :ResearchSubject/period :ResearchSubject/text :ResearchSubject/identifier :ResearchSubject/assignedArm :ResearchSubject/actualArm :ResearchSubject/implicitRules :ResearchSubject/id :ResearchSubject/contained]))

;; ExpansionProfile

(s/def ::ExpansionProfile
  (s/keys :req [:ExpansionProfile/status]
          :opt [:ExpansionProfile/activeOnly :ExpansionProfile/includeDefinition :ExpansionProfile/jurisdiction :ExpansionProfile/limitedExpansion :ExpansionProfile/url :ExpansionProfile/language :ExpansionProfile/displayLanguage :ExpansionProfile/excludePostCoordinated :ExpansionProfile/excludeNested :ExpansionProfile/experimental :ExpansionProfile/meta :ExpansionProfile/contact :ExpansionProfile/designation :ExpansionProfile/identifier :ExpansionProfile/id :ExpansionProfile/name :ExpansionProfile/contained :ExpansionProfile/description :ExpansionProfile/fixedVersion :ExpansionProfile/implicitRules :ExpansionProfile/excludeNotForUI :ExpansionProfile/publisher :ExpansionProfile/excludedSystem :ExpansionProfile/version :ExpansionProfile/useContext :ExpansionProfile/date :ExpansionProfile/text :ExpansionProfile/includeDesignations]))

;; EligibilityRequest

(s/def ::EligibilityRequest
  (s/keys :req []
          :opt [:EligibilityRequest/id :EligibilityRequest/identifier :EligibilityRequest/text :EligibilityRequest/priority :EligibilityRequest/meta :EligibilityRequest/coverage :EligibilityRequest/serviced :EligibilityRequest/status :EligibilityRequest/created :EligibilityRequest/provider :EligibilityRequest/facility :EligibilityRequest/benefitSubCategory :EligibilityRequest/insurer :EligibilityRequest/language :EligibilityRequest/patient :EligibilityRequest/benefitCategory :EligibilityRequest/businessArrangement :EligibilityRequest/enterer :EligibilityRequest/organization :EligibilityRequest/implicitRules :EligibilityRequest/contained]))

;; PaymentNotice

(s/def ::PaymentNotice
  (s/keys :req []
          :opt [:PaymentNotice/provider :PaymentNotice/text :PaymentNotice/organization :PaymentNotice/created :PaymentNotice/request :PaymentNotice/id :PaymentNotice/status :PaymentNotice/target :PaymentNotice/identifier :PaymentNotice/paymentStatus :PaymentNotice/meta :PaymentNotice/implicitRules :PaymentNotice/language :PaymentNotice/statusDate :PaymentNotice/response :PaymentNotice/contained]))

;; NamingSystem

(s/def ::NamingSystem
  (s/keys :req [:NamingSystem/date :NamingSystem/kind :NamingSystem/status :NamingSystem/name :NamingSystem/uniqueId]
          :opt [:NamingSystem/language :NamingSystem/type :NamingSystem/replacedBy :NamingSystem/jurisdiction :NamingSystem/contained :NamingSystem/responsible :NamingSystem/meta :NamingSystem/description :NamingSystem/contact :NamingSystem/usage :NamingSystem/id :NamingSystem/publisher :NamingSystem/implicitRules :NamingSystem/text :NamingSystem/useContext]))

;; MedicationStatement

(s/def ::MedicationStatement
  (s/keys :req [:MedicationStatement/taken :MedicationStatement/subject :MedicationStatement/status]
          :opt [:MedicationStatement/dosage :MedicationStatement/dateAsserted :MedicationStatement/identifier :MedicationStatement/category :MedicationStatement/meta :MedicationStatement/implicitRules :MedicationStatement/contained :MedicationStatement/language :MedicationStatement/informationSource :MedicationStatement/basedOn :MedicationStatement/id :MedicationStatement/reasonNotTaken :MedicationStatement/medication :MedicationStatement/reasonReference :MedicationStatement/context :MedicationStatement/note :MedicationStatement/effective :MedicationStatement/reasonCode :MedicationStatement/partOf :MedicationStatement/text :MedicationStatement/derivedFrom]))

;; EnrollmentResponse

(s/def ::EnrollmentResponse
  (s/keys :req []
          :opt [:EnrollmentResponse/status :EnrollmentResponse/id :EnrollmentResponse/outcome :EnrollmentResponse/created :EnrollmentResponse/requestProvider :EnrollmentResponse/text :EnrollmentResponse/language :EnrollmentResponse/meta :EnrollmentResponse/request :EnrollmentResponse/contained :EnrollmentResponse/requestOrganization :EnrollmentResponse/identifier :EnrollmentResponse/organization :EnrollmentResponse/disposition :EnrollmentResponse/implicitRules]))

;; NutritionOrder

(s/def ::NutritionOrder
  (s/keys :req [:NutritionOrder/dateTime :NutritionOrder/patient]
          :opt [:NutritionOrder/foodPreferenceModifier :NutritionOrder/enteralFormula :NutritionOrder/language :NutritionOrder/meta :NutritionOrder/supplement :NutritionOrder/implicitRules :NutritionOrder/id :NutritionOrder/identifier :NutritionOrder/contained :NutritionOrder/allergyIntolerance :NutritionOrder/text :NutritionOrder/status :NutritionOrder/encounter :NutritionOrder/excludeFoodModifier :NutritionOrder/oralDiet :NutritionOrder/orderer]))

;; Questionnaire

(s/def ::Questionnaire
  (s/keys :req [:Questionnaire/status]
          :opt [:Questionnaire/text :Questionnaire/approvalDate :Questionnaire/code :Questionnaire/copyright :Questionnaire/title :Questionnaire/lastReviewDate :Questionnaire/effectivePeriod :Questionnaire/meta :Questionnaire/identifier :Questionnaire/implicitRules :Questionnaire/publisher :Questionnaire/purpose :Questionnaire/item :Questionnaire/contained :Questionnaire/description :Questionnaire/subjectType :Questionnaire/language :Questionnaire/experimental :Questionnaire/url :Questionnaire/contact :Questionnaire/jurisdiction :Questionnaire/date :Questionnaire/name :Questionnaire/useContext :Questionnaire/version :Questionnaire/id]))

;; Account

(s/def ::Account
  (s/keys :req []
          :opt [:Account/language :Account/active :Account/period :Account/implicitRules :Account/id :Account/contained :Account/description :Account/name :Account/text :Account/balance :Account/identifier :Account/owner :Account/guarantor :Account/subject :Account/coverage :Account/meta :Account/type :Account/status]))

;; CommunicationRequest

(s/def ::CommunicationRequest
  (s/keys :req [:CommunicationRequest/status]
          :opt [:CommunicationRequest/recipient :CommunicationRequest/reasonCode :CommunicationRequest/occurrence :CommunicationRequest/context :CommunicationRequest/subject :CommunicationRequest/language :CommunicationRequest/category :CommunicationRequest/topic :CommunicationRequest/medium :CommunicationRequest/meta :CommunicationRequest/basedOn :CommunicationRequest/sender :CommunicationRequest/priority :CommunicationRequest/contained :CommunicationRequest/implicitRules :CommunicationRequest/authoredOn :CommunicationRequest/text :CommunicationRequest/id :CommunicationRequest/replaces :CommunicationRequest/requester :CommunicationRequest/payload :CommunicationRequest/groupIdentifier :CommunicationRequest/note :CommunicationRequest/identifier :CommunicationRequest/reasonReference]))

;; DocumentManifest

(s/def ::DocumentManifest
  (s/keys :req [:DocumentManifest/status :DocumentManifest/content]
          :opt [:DocumentManifest/created :DocumentManifest/recipient :DocumentManifest/identifier :DocumentManifest/meta :DocumentManifest/language :DocumentManifest/subject :DocumentManifest/description :DocumentManifest/implicitRules :DocumentManifest/text :DocumentManifest/type :DocumentManifest/author :DocumentManifest/related :DocumentManifest/id :DocumentManifest/source :DocumentManifest/contained :DocumentManifest/masterIdentifier]))

;; EligibilityResponse

(s/def ::EligibilityResponse
  (s/keys :req []
          :opt [:EligibilityResponse/inforce :EligibilityResponse/requestOrganization :EligibilityResponse/contained :EligibilityResponse/insurance :EligibilityResponse/insurer :EligibilityResponse/error :EligibilityResponse/meta :EligibilityResponse/language :EligibilityResponse/implicitRules :EligibilityResponse/requestProvider :EligibilityResponse/created :EligibilityResponse/id :EligibilityResponse/identifier :EligibilityResponse/form :EligibilityResponse/disposition :EligibilityResponse/request :EligibilityResponse/status :EligibilityResponse/text :EligibilityResponse/outcome]))

;; Task

(s/def ::Task
  (s/keys :req [:Task/intent :Task/status]
          :opt [:Task/owner :Task/language :Task/code :Task/restriction :Task/lastModified :Task/description :Task/basedOn :Task/input :Task/id :Task/reason :Task/implicitRules :Task/definition :Task/performerType :Task/priority :Task/authoredOn :Task/output :Task/context :Task/businessStatus :Task/partOf :Task/for :Task/identifier :Task/relevantHistory :Task/executionPeriod :Task/focus :Task/contained :Task/groupIdentifier :Task/statusReason :Task/requester :Task/meta :Task/text :Task/note]))

;; ValueSet

(s/def ::ValueSet
  (s/keys :req [:ValueSet/status]
          :opt [:ValueSet/copyright :ValueSet/text :ValueSet/jurisdiction :ValueSet/url :ValueSet/contained :ValueSet/purpose :ValueSet/meta :ValueSet/name :ValueSet/date :ValueSet/immutable :ValueSet/experimental :ValueSet/id :ValueSet/description :ValueSet/compose :ValueSet/extensible :ValueSet/contact :ValueSet/language :ValueSet/publisher :ValueSet/title :ValueSet/identifier :ValueSet/implicitRules :ValueSet/useContext :ValueSet/version :ValueSet/expansion]))

;; Claim

(s/def ::Claim
  (s/keys :req []
          :opt [:Claim/prescription :Claim/fundsReserve :Claim/meta :Claim/priority :Claim/status :Claim/language :Claim/use :Claim/enterer :Claim/subType :Claim/implicitRules :Claim/payee :Claim/diagnosis :Claim/referral :Claim/id :Claim/information :Claim/identifier :Claim/organization :Claim/created :Claim/type :Claim/accident :Claim/procedure :Claim/item :Claim/contained :Claim/insurance :Claim/hospitalization :Claim/facility :Claim/insurer :Claim/patient :Claim/careTeam :Claim/text :Claim/provider :Claim/total :Claim/originalPrescription :Claim/employmentImpacted :Claim/related :Claim/billablePeriod]))

;; ResearchStudy

(s/def ::ResearchStudy
  (s/keys :req [:ResearchStudy/status]
          :opt [:ResearchStudy/period :ResearchStudy/category :ResearchStudy/arm :ResearchStudy/relatedArtifact :ResearchStudy/contact :ResearchStudy/focus :ResearchStudy/meta :ResearchStudy/contained :ResearchStudy/implicitRules :ResearchStudy/sponsor :ResearchStudy/principalInvestigator :ResearchStudy/identifier :ResearchStudy/keyword :ResearchStudy/description :ResearchStudy/language :ResearchStudy/title :ResearchStudy/note :ResearchStudy/protocol :ResearchStudy/id :ResearchStudy/site :ResearchStudy/reasonStopped :ResearchStudy/partOf :ResearchStudy/enrollment :ResearchStudy/text :ResearchStudy/jurisdiction]))

;; MedicationRequest

(s/def ::MedicationRequest
  (s/keys :req [:MedicationRequest/subject :MedicationRequest/intent]
          :opt [:MedicationRequest/priorPrescription :MedicationRequest/priority :MedicationRequest/substitution :MedicationRequest/text :MedicationRequest/medication :MedicationRequest/identifier :MedicationRequest/context :MedicationRequest/requester :MedicationRequest/category :MedicationRequest/recorder :MedicationRequest/groupIdentifier :MedicationRequest/note :MedicationRequest/supportingInformation :MedicationRequest/definition :MedicationRequest/dispenseRequest :MedicationRequest/implicitRules :MedicationRequest/dosageInstruction :MedicationRequest/reasonReference :MedicationRequest/status :MedicationRequest/authoredOn :MedicationRequest/basedOn :MedicationRequest/detectedIssue :MedicationRequest/eventHistory :MedicationRequest/reasonCode :MedicationRequest/id :MedicationRequest/contained :MedicationRequest/language :MedicationRequest/meta]))

;; Measure

(s/def ::Measure
  (s/keys :req [:Measure/status]
          :opt [:Measure/effectivePeriod :Measure/scoring :Measure/publisher :Measure/title :Measure/useContext :Measure/implicitRules :Measure/meta :Measure/type :Measure/set :Measure/disclaimer :Measure/name :Measure/jurisdiction :Measure/lastReviewDate :Measure/riskAdjustment :Measure/contained :Measure/contributor :Measure/definition :Measure/contact :Measure/compositeScoring :Measure/library :Measure/text :Measure/version :Measure/date :Measure/url :Measure/rateAggregation :Measure/improvementNotation :Measure/experimental :Measure/relatedArtifact :Measure/clinicalRecommendationStatement :Measure/group :Measure/usage :Measure/approvalDate :Measure/description :Measure/guidance :Measure/copyright :Measure/language :Measure/topic :Measure/id :Measure/identifier :Measure/supplementalData :Measure/purpose :Measure/rationale]))

;; List

(s/def ::List
  (s/keys :req [:List/mode :List/status]
          :opt [:List/contained :List/implicitRules :List/meta :List/title :List/id :List/orderedBy :List/date :List/source :List/note :List/text :List/language :List/encounter :List/code :List/subject :List/identifier :List/entry :List/emptyReason]))

;; ServiceDefinition

(s/def ::ServiceDefinition
  (s/keys :req [:ServiceDefinition/status]
          :opt [:ServiceDefinition/topic :ServiceDefinition/implicitRules :ServiceDefinition/jurisdiction :ServiceDefinition/effectivePeriod :ServiceDefinition/version :ServiceDefinition/contributor :ServiceDefinition/useContext :ServiceDefinition/trigger :ServiceDefinition/contained :ServiceDefinition/title :ServiceDefinition/description :ServiceDefinition/name :ServiceDefinition/approvalDate :ServiceDefinition/relatedArtifact :ServiceDefinition/date :ServiceDefinition/contact :ServiceDefinition/text :ServiceDefinition/purpose :ServiceDefinition/experimental :ServiceDefinition/usage :ServiceDefinition/lastReviewDate :ServiceDefinition/language :ServiceDefinition/publisher :ServiceDefinition/copyright :ServiceDefinition/meta :ServiceDefinition/operationDefinition :ServiceDefinition/id :ServiceDefinition/dataRequirement :ServiceDefinition/identifier :ServiceDefinition/url]))

;; Encounter

(s/def ::Encounter
  (s/keys :req [:Encounter/status]
          :opt [:Encounter/contained :Encounter/length :Encounter/incomingReferral :Encounter/period :Encounter/participant :Encounter/episodeOfCare :Encounter/language :Encounter/reason :Encounter/identifier :Encounter/hospitalization :Encounter/location :Encounter/statusHistory :Encounter/class :Encounter/serviceProvider :Encounter/text :Encounter/partOf :Encounter/account :Encounter/subject :Encounter/implicitRules :Encounter/diagnosis :Encounter/id :Encounter/meta :Encounter/classHistory :Encounter/appointment :Encounter/priority :Encounter/type]))

;; CapabilityStatement

(s/def ::CapabilityStatement
  (s/keys :req [:CapabilityStatement/kind :CapabilityStatement/acceptUnknown :CapabilityStatement/format :CapabilityStatement/date :CapabilityStatement/fhirVersion :CapabilityStatement/status]
          :opt [:CapabilityStatement/jurisdiction :CapabilityStatement/copyright :CapabilityStatement/experimental :CapabilityStatement/implementationGuide :CapabilityStatement/profile :CapabilityStatement/description :CapabilityStatement/useContext :CapabilityStatement/patchFormat :CapabilityStatement/instantiates :CapabilityStatement/version :CapabilityStatement/id :CapabilityStatement/title :CapabilityStatement/language :CapabilityStatement/meta :CapabilityStatement/software :CapabilityStatement/implicitRules :CapabilityStatement/implementation :CapabilityStatement/text :CapabilityStatement/purpose :CapabilityStatement/url :CapabilityStatement/messaging :CapabilityStatement/name :CapabilityStatement/contained :CapabilityStatement/contact :CapabilityStatement/rest :CapabilityStatement/document :CapabilityStatement/publisher]))

;; VisionPrescription

(s/def ::VisionPrescription
  (s/keys :req []
          :opt [:VisionPrescription/reason :VisionPrescription/implicitRules :VisionPrescription/id :VisionPrescription/meta :VisionPrescription/text :VisionPrescription/dispense :VisionPrescription/language :VisionPrescription/patient :VisionPrescription/dateWritten :VisionPrescription/status :VisionPrescription/prescriber :VisionPrescription/contained :VisionPrescription/identifier :VisionPrescription/encounter]))

;; RiskAssessment

(s/def ::RiskAssessment
  (s/keys :req [:RiskAssessment/status]
          :opt [:RiskAssessment/comment :RiskAssessment/condition :RiskAssessment/identifier :RiskAssessment/subject :RiskAssessment/prediction :RiskAssessment/basedOn :RiskAssessment/basis :RiskAssessment/language :RiskAssessment/context :RiskAssessment/mitigation :RiskAssessment/performer :RiskAssessment/text :RiskAssessment/method :RiskAssessment/contained :RiskAssessment/code :RiskAssessment/occurrence :RiskAssessment/id :RiskAssessment/parent :RiskAssessment/meta :RiskAssessment/implicitRules :RiskAssessment/reason]))

;; BodySite

(s/def ::BodySite
  (s/keys :req [:BodySite/patient]
          :opt [:BodySite/image :BodySite/id :BodySite/active :BodySite/meta :BodySite/language :BodySite/contained :BodySite/code :BodySite/identifier :BodySite/qualifier :BodySite/description :BodySite/text :BodySite/implicitRules]))

;; ImmunizationRecommendation

(s/def ::ImmunizationRecommendation
  (s/keys :req [:ImmunizationRecommendation/recommendation :ImmunizationRecommendation/patient]
          :opt [:ImmunizationRecommendation/identifier :ImmunizationRecommendation/meta :ImmunizationRecommendation/contained :ImmunizationRecommendation/id :ImmunizationRecommendation/text :ImmunizationRecommendation/language :ImmunizationRecommendation/implicitRules]))

;; ProcessRequest

(s/def ::ProcessRequest
  (s/keys :req []
          :opt [:ProcessRequest/include :ProcessRequest/item :ProcessRequest/action :ProcessRequest/identifier :ProcessRequest/language :ProcessRequest/exclude :ProcessRequest/period :ProcessRequest/response :ProcessRequest/created :ProcessRequest/implicitRules :ProcessRequest/reference :ProcessRequest/meta :ProcessRequest/provider :ProcessRequest/request :ProcessRequest/status :ProcessRequest/target :ProcessRequest/contained :ProcessRequest/nullify :ProcessRequest/text :ProcessRequest/organization :ProcessRequest/id]))

;; RelatedPerson

(s/def ::RelatedPerson
  (s/keys :req [:RelatedPerson/patient]
          :opt [:RelatedPerson/name :RelatedPerson/address :RelatedPerson/birthDate :RelatedPerson/contained :RelatedPerson/period :RelatedPerson/photo :RelatedPerson/id :RelatedPerson/meta :RelatedPerson/identifier :RelatedPerson/active :RelatedPerson/relationship :RelatedPerson/gender :RelatedPerson/implicitRules :RelatedPerson/telecom :RelatedPerson/language :RelatedPerson/text]))

;; Medication

(s/def ::Medication
  (s/keys :req []
          :opt [:Medication/code :Medication/meta :Medication/contained :Medication/text :Medication/id :Medication/isBrand :Medication/image :Medication/isOverTheCounter :Medication/ingredient :Medication/package :Medication/status :Medication/implicitRules :Medication/language :Medication/form :Medication/manufacturer]))

;; AppointmentResponse

(s/def ::AppointmentResponse
  (s/keys :req [:AppointmentResponse/appointment :AppointmentResponse/participantStatus]
          :opt [:AppointmentResponse/language :AppointmentResponse/text :AppointmentResponse/end :AppointmentResponse/identifier :AppointmentResponse/meta :AppointmentResponse/id :AppointmentResponse/participantType :AppointmentResponse/comment :AppointmentResponse/implicitRules :AppointmentResponse/actor :AppointmentResponse/contained :AppointmentResponse/start]))

;; Substance

(s/def ::Substance
  (s/keys :req [:Substance/code]
          :opt [:Substance/meta :Substance/text :Substance/identifier :Substance/instance :Substance/implicitRules :Substance/contained :Substance/category :Substance/description :Substance/status :Substance/language :Substance/id :Substance/ingredient]))

;; PaymentReconciliation

(s/def ::PaymentReconciliation
  (s/keys :req []
          :opt [:PaymentReconciliation/status :PaymentReconciliation/disposition :PaymentReconciliation/id :PaymentReconciliation/requestOrganization :PaymentReconciliation/contained :PaymentReconciliation/request :PaymentReconciliation/total :PaymentReconciliation/period :PaymentReconciliation/identifier :PaymentReconciliation/outcome :PaymentReconciliation/form :PaymentReconciliation/organization :PaymentReconciliation/meta :PaymentReconciliation/processNote :PaymentReconciliation/requestProvider :PaymentReconciliation/text :PaymentReconciliation/implicitRules :PaymentReconciliation/detail :PaymentReconciliation/language :PaymentReconciliation/created]))

;; ConceptMap

(s/def ::ConceptMap
  (s/keys :req [:ConceptMap/status]
          :opt [:ConceptMap/language :ConceptMap/id :ConceptMap/title :ConceptMap/meta :ConceptMap/group :ConceptMap/purpose :ConceptMap/date :ConceptMap/target :ConceptMap/contact :ConceptMap/copyright :ConceptMap/name :ConceptMap/source :ConceptMap/experimental :ConceptMap/contained :ConceptMap/url :ConceptMap/version :ConceptMap/identifier :ConceptMap/jurisdiction :ConceptMap/text :ConceptMap/description :ConceptMap/useContext :ConceptMap/implicitRules :ConceptMap/publisher]))

;; Person

(s/def ::Person
  (s/keys :req []
          :opt [:Person/link :Person/language :Person/telecom :Person/identifier :Person/name :Person/managingOrganization :Person/active :Person/gender :Person/contained :Person/photo :Person/birthDate :Person/meta :Person/address :Person/id :Person/implicitRules :Person/text]))

;; Condition

(s/def ::Condition
  (s/keys :req [:Condition/subject]
          :opt [:Condition/identifier :Condition/category :Condition/verificationStatus :Condition/stage :Condition/language :Condition/asserter :Condition/context :Condition/clinicalStatus :Condition/assertedDate :Condition/evidence :Condition/abatement :Condition/code :Condition/onset :Condition/bodySite :Condition/severity :Condition/meta :Condition/contained :Condition/id :Condition/text :Condition/note :Condition/implicitRules]))

;; CareTeam

(s/def ::CareTeam
  (s/keys :req []
          :opt [:CareTeam/context :CareTeam/language :CareTeam/managingOrganization :CareTeam/name :CareTeam/status :CareTeam/note :CareTeam/id :CareTeam/participant :CareTeam/category :CareTeam/contained :CareTeam/period :CareTeam/reasonReference :CareTeam/text :CareTeam/subject :CareTeam/reasonCode :CareTeam/implicitRules :CareTeam/meta :CareTeam/identifier]))

;; StructureDefinition

(s/def ::StructureDefinition
  (s/keys :req [:StructureDefinition/url :StructureDefinition/status :StructureDefinition/kind :StructureDefinition/abstract :StructureDefinition/name :StructureDefinition/type]
          :opt [:StructureDefinition/date :StructureDefinition/description :StructureDefinition/snapshot :StructureDefinition/keyword :StructureDefinition/contextInvariant :StructureDefinition/useContext :StructureDefinition/copyright :StructureDefinition/differential :StructureDefinition/context :StructureDefinition/baseDefinition :StructureDefinition/identifier :StructureDefinition/mapping :StructureDefinition/contextType :StructureDefinition/title :StructureDefinition/version :StructureDefinition/meta :StructureDefinition/purpose :StructureDefinition/implicitRules :StructureDefinition/contact :StructureDefinition/language :StructureDefinition/experimental :StructureDefinition/derivation :StructureDefinition/jurisdiction :StructureDefinition/contained :StructureDefinition/publisher :StructureDefinition/text :StructureDefinition/fhirVersion :StructureDefinition/id]))

;; Procedure

(s/def ::Procedure
  (s/keys :req [:Procedure/subject :Procedure/status]
          :opt [:Procedure/id :Procedure/contained :Procedure/performed :Procedure/notDoneReason :Procedure/notDone :Procedure/focalDevice :Procedure/outcome :Procedure/usedCode :Procedure/followUp :Procedure/basedOn :Procedure/location :Procedure/reasonCode :Procedure/category :Procedure/language :Procedure/performer :Procedure/definition :Procedure/usedReference :Procedure/complication :Procedure/code :Procedure/text :Procedure/implicitRules :Procedure/bodySite :Procedure/context :Procedure/partOf :Procedure/reasonReference :Procedure/note :Procedure/meta :Procedure/report :Procedure/identifier :Procedure/complicationDetail]))

;; Consent

(s/def ::Consent
  (s/keys :req [:Consent/status :Consent/patient]
          :opt [:Consent/except :Consent/text :Consent/source :Consent/action :Consent/policyRule :Consent/purpose :Consent/securityLabel :Consent/identifier :Consent/language :Consent/category :Consent/contained :Consent/consentingParty :Consent/id :Consent/meta :Consent/data :Consent/period :Consent/dateTime :Consent/actor :Consent/implicitRules :Consent/organization :Consent/policy :Consent/dataPeriod]))

;; Attribute

(s/def ::Attribute
  (s/keys :req []
          :opt [:Attribute/order :Attribute/valueSet :Attribute/isSummary :Attribute/isModifier :Attribute/refers]))

;; Location

(s/def ::Location
  (s/keys :req []
          :opt [:Location/managingOrganization :Location/telecom :Location/implicitRules :Location/description :Location/language :Location/physicalType :Location/identifier :Location/mode :Location/contained :Location/text :Location/endpoint :Location/position :Location/name :Location/status :Location/id :Location/partOf :Location/address :Location/alias :Location/type :Location/operationalStatus :Location/meta]))

;; Organization

(s/def ::Organization
  (s/keys :req []
          :opt [:Organization/alias :Organization/implicitRules :Organization/text :Organization/telecom :Organization/id :Organization/partOf :Organization/meta :Organization/language :Organization/name :Organization/identifier :Organization/contained :Organization/endpoint :Organization/type :Organization/active :Organization/address :Organization/contact]))

;; Device

(s/def ::Device
  (s/keys :req []
          :opt [:Device/patient :Device/manufactureDate :Device/location :Device/version :Device/lotNumber :Device/id :Device/expirationDate :Device/meta :Device/safety :Device/model :Device/implicitRules :Device/identifier :Device/status :Device/text :Device/type :Device/owner :Device/note :Device/udi :Device/contact :Device/url :Device/language :Device/manufacturer :Device/contained]))

;; SupplyRequest

(s/def ::SupplyRequest
  (s/keys :req []
          :opt [:SupplyRequest/text :SupplyRequest/id :SupplyRequest/language :SupplyRequest/supplier :SupplyRequest/meta :SupplyRequest/status :SupplyRequest/category :SupplyRequest/reason :SupplyRequest/deliverFrom :SupplyRequest/deliverTo :SupplyRequest/priority :SupplyRequest/implicitRules :SupplyRequest/authoredOn :SupplyRequest/orderedItem :SupplyRequest/identifier :SupplyRequest/requester :SupplyRequest/contained :SupplyRequest/occurrence]))

;; AllergyIntolerance

(s/def ::AllergyIntolerance
  (s/keys :req [:AllergyIntolerance/verificationStatus :AllergyIntolerance/patient]
          :opt [:AllergyIntolerance/onset :AllergyIntolerance/recorder :AllergyIntolerance/asserter :AllergyIntolerance/assertedDate :AllergyIntolerance/language :AllergyIntolerance/identifier :AllergyIntolerance/note :AllergyIntolerance/clinicalStatus :AllergyIntolerance/reaction :AllergyIntolerance/implicitRules :AllergyIntolerance/code :AllergyIntolerance/meta :AllergyIntolerance/category :AllergyIntolerance/text :AllergyIntolerance/lastOccurrence :AllergyIntolerance/id :AllergyIntolerance/type :AllergyIntolerance/contained :AllergyIntolerance/criticality]))

;; OperationDefinition

(s/def ::OperationDefinition
  (s/keys :req [:OperationDefinition/kind :OperationDefinition/code :OperationDefinition/status :OperationDefinition/instance :OperationDefinition/system :OperationDefinition/type :OperationDefinition/name]
          :opt [:OperationDefinition/base :OperationDefinition/text :OperationDefinition/resource :OperationDefinition/overload :OperationDefinition/version :OperationDefinition/contained :OperationDefinition/purpose :OperationDefinition/language :OperationDefinition/date :OperationDefinition/idempotent :OperationDefinition/useContext :OperationDefinition/publisher :OperationDefinition/implicitRules :OperationDefinition/experimental :OperationDefinition/meta :OperationDefinition/comment :OperationDefinition/description :OperationDefinition/parameter :OperationDefinition/url :OperationDefinition/jurisdiction :OperationDefinition/id :OperationDefinition/contact]))

;; ImagingManifest

(s/def ::ImagingManifest
  (s/keys :req [:ImagingManifest/patient :ImagingManifest/study]
          :opt [:ImagingManifest/description :ImagingManifest/contained :ImagingManifest/identifier :ImagingManifest/id :ImagingManifest/implicitRules :ImagingManifest/author :ImagingManifest/authoringTime :ImagingManifest/meta :ImagingManifest/language :ImagingManifest/text]))

;; ImagingStudy

(s/def ::ImagingStudy
  (s/keys :req [:ImagingStudy/uid :ImagingStudy/patient]
          :opt [:ImagingStudy/meta :ImagingStudy/implicitRules :ImagingStudy/language :ImagingStudy/reason :ImagingStudy/description :ImagingStudy/modalityList :ImagingStudy/context :ImagingStudy/text :ImagingStudy/procedureReference :ImagingStudy/numberOfInstances :ImagingStudy/numberOfSeries :ImagingStudy/series :ImagingStudy/interpreter :ImagingStudy/id :ImagingStudy/referrer :ImagingStudy/procedureCode :ImagingStudy/started :ImagingStudy/accession :ImagingStudy/basedOn :ImagingStudy/endpoint :ImagingStudy/contained :ImagingStudy/identifier :ImagingStudy/availability]))

;; GuidanceResponse

(s/def ::GuidanceResponse
  (s/keys :req [:GuidanceResponse/status :GuidanceResponse/module]
          :opt [:GuidanceResponse/dataRequirement :GuidanceResponse/contained :GuidanceResponse/evaluationMessage :GuidanceResponse/reason :GuidanceResponse/meta :GuidanceResponse/id :GuidanceResponse/performer :GuidanceResponse/occurrenceDateTime :GuidanceResponse/note :GuidanceResponse/text :GuidanceResponse/result :GuidanceResponse/subject :GuidanceResponse/implicitRules :GuidanceResponse/requestId :GuidanceResponse/context :GuidanceResponse/identifier :GuidanceResponse/language :GuidanceResponse/outputParameters]))

;; Media

(s/def ::Media
  (s/keys :req [:Media/content :Media/type]
          :opt [:Media/width :Media/contained :Media/id :Media/language :Media/frames :Media/subtype :Media/bodySite :Media/reasonCode :Media/height :Media/device :Media/duration :Media/view :Media/identifier :Media/implicitRules :Media/meta :Media/basedOn :Media/operator :Media/occurrence :Media/note :Media/context :Media/text :Media/subject]))

;; MeasureReport

(s/def ::MeasureReport
  (s/keys :req [:MeasureReport/type :MeasureReport/status :MeasureReport/period :MeasureReport/measure]
          :opt [:MeasureReport/implicitRules :MeasureReport/meta :MeasureReport/date :MeasureReport/identifier :MeasureReport/text :MeasureReport/reportingOrganization :MeasureReport/language :MeasureReport/evaluatedResources :MeasureReport/id :MeasureReport/group :MeasureReport/patient :MeasureReport/contained]))

;; GraphDefinition

(s/def ::GraphDefinition
  (s/keys :req [:GraphDefinition/status :GraphDefinition/name :GraphDefinition/start]
          :opt [:GraphDefinition/meta :GraphDefinition/experimental :GraphDefinition/implicitRules :GraphDefinition/date :GraphDefinition/useContext :GraphDefinition/id :GraphDefinition/contact :GraphDefinition/language :GraphDefinition/version :GraphDefinition/profile :GraphDefinition/link :GraphDefinition/contained :GraphDefinition/text :GraphDefinition/purpose :GraphDefinition/jurisdiction :GraphDefinition/url :GraphDefinition/description :GraphDefinition/publisher]))

;; MetadataResource

(s/def ::MetadataResource
  (s/keys :req [:MetadataResource/status]
          :opt [:MetadataResource/version :MetadataResource/title :MetadataResource/description :MetadataResource/language :MetadataResource/jurisdiction :MetadataResource/id :MetadataResource/implicitRules :MetadataResource/date :MetadataResource/contact :MetadataResource/name :MetadataResource/url :MetadataResource/contained :MetadataResource/meta :MetadataResource/useContext :MetadataResource/experimental :MetadataResource/text :MetadataResource/publisher]))

;; Timing

(s/def ::Timing
  (s/keys :req []
          :opt [:Timing/repeat :Timing/id :Timing/event :Timing/code]))

;; ElementDefinition

(s/def ::ElementDefinition
  (s/keys :req [:ElementDefinition/path]
          :opt [:ElementDefinition/comment :ElementDefinition/meaningWhenMissing :ElementDefinition/constraint :ElementDefinition/minValue :ElementDefinition/maxValue :ElementDefinition/isSummary :ElementDefinition/mapping :ElementDefinition/id :ElementDefinition/fixed :ElementDefinition/defaultValue :ElementDefinition/maxLength :ElementDefinition/max :ElementDefinition/type :ElementDefinition/code :ElementDefinition/base :ElementDefinition/requirements :ElementDefinition/alias :ElementDefinition/condition :ElementDefinition/pattern :ElementDefinition/representation :ElementDefinition/mustSupport :ElementDefinition/short :ElementDefinition/definition :ElementDefinition/binding :ElementDefinition/contentReference :ElementDefinition/orderMeaning :ElementDefinition/label :ElementDefinition/example :ElementDefinition/slicing :ElementDefinition/isModifier :ElementDefinition/min :ElementDefinition/sliceName]))

;; Annotation

(s/def ::Annotation
  (s/keys :req [:Annotation/text]
          :opt [:Annotation/id :Annotation/time :Annotation/author]))

;; SampledData

(s/def ::SampledData
  (s/keys :req [:SampledData/period :SampledData/dimensions :SampledData/origin :SampledData/data]
          :opt [:SampledData/upperLimit :SampledData/lowerLimit :SampledData/factor :SampledData/id]))

;; Bundle

(s/def ::Bundle
  (s/keys :req [:Bundle/type]
          :opt [:Bundle/total :Bundle/entry :Bundle/implicitRules :Bundle/identifier :Bundle/link :Bundle/language :Bundle/meta :Bundle/signature :Bundle/id]))

;; ContactPoint

(s/def ::ContactPoint
  (s/keys :req []
          :opt [:ContactPoint/period :ContactPoint/value :ContactPoint/system :ContactPoint/use :ContactPoint/rank :ContactPoint/id]))

;; Dosage

(s/def ::Dosage
  (s/keys :req []
          :opt [:Dosage/additionalInstruction :Dosage/dose :Dosage/method :Dosage/maxDosePerLifetime :Dosage/asNeeded :Dosage/route :Dosage/patientInstruction :Dosage/rate :Dosage/site :Dosage/maxDosePerPeriod :Dosage/maxDosePerAdministration :Dosage/timing :Dosage/sequence :Dosage/text :Dosage/id]))

;; Address

(s/def ::Address
  (s/keys :req []
          :opt [:Address/postalCode :Address/line :Address/period :Address/type :Address/city :Address/state :Address/id :Address/use :Address/text :Address/district :Address/country]))

;; DataRequirement

(s/def ::DataRequirement
  (s/keys :req [:DataRequirement/type]
          :opt [:DataRequirement/profile :DataRequirement/codeFilter :DataRequirement/dateFilter :DataRequirement/mustSupport :DataRequirement/id]))

;; ParameterDefinition

(s/def ::ParameterDefinition
  (s/keys :req [:ParameterDefinition/type :ParameterDefinition/use]
          :opt [:ParameterDefinition/name :ParameterDefinition/documentation :ParameterDefinition/id :ParameterDefinition/min :ParameterDefinition/max :ParameterDefinition/profile]))

;; Coding

(s/def ::Coding
  (s/keys :req []
          :opt [:Coding/system :Coding/code :Coding/version :Coding/display :Coding/id :Coding/userSelected]))

;; Attachment

(s/def ::Attachment
  (s/keys :req []
          :opt [:Attachment/title :Attachment/url :Attachment/contentType :Attachment/hash :Attachment/data :Attachment/size :Attachment/id :Attachment/creation :Attachment/language]))

;; DomainResource

(s/def ::DomainResource
  (s/keys :req []
          :opt [:DomainResource/implicitRules :DomainResource/language :DomainResource/contained :DomainResource/meta :DomainResource/id :DomainResource/text]))

;; Age

(s/def ::Age
  (s/keys :req []
          :opt [:Age/code :Age/value :Age/id :Age/unit :Age/system :Age/comparator]))

;; Ratio

(s/def ::Ratio
  (s/keys :req []
          :opt [:Ratio/denominator :Ratio/numerator :Ratio/id]))

;; RelatedArtifact

(s/def ::RelatedArtifact
  (s/keys :req [:RelatedArtifact/type]
          :opt [:RelatedArtifact/display :RelatedArtifact/id :RelatedArtifact/url :RelatedArtifact/resource :RelatedArtifact/citation :RelatedArtifact/document]))

;; TriggerDefinition

(s/def ::TriggerDefinition
  (s/keys :req [:TriggerDefinition/type]
          :opt [:TriggerDefinition/eventName :TriggerDefinition/id :TriggerDefinition/eventData :TriggerDefinition/eventTiming]))

;; SimpleQuantity

(s/def ::SimpleQuantity
  (s/keys :req []
          :opt [:SimpleQuantity/comparator :SimpleQuantity/value :SimpleQuantity/code :SimpleQuantity/id :SimpleQuantity/system :SimpleQuantity/unit]))

;; Range

(s/def ::Range
  (s/keys :req []
          :opt [:Range/low :Range/high :Range/id]))

;; Signature

(s/def ::Signature
  (s/keys :req [:Signature/when :Signature/type]
          :opt [:Signature/id :Signature/who :Signature/onBehalfOf :Signature/blob :Signature/contentType]))

;; UsageContext

(s/def ::UsageContext
  (s/keys :req [:UsageContext/code]
          :opt [:UsageContext/id :UsageContext/value]))

;; Meta

(s/def ::Meta
  (s/keys :req []
          :opt [:Meta/lastUpdated :Meta/id :Meta/security :Meta/tag :Meta/profile :Meta/versionId]))

;; Period

(s/def ::Period
  (s/keys :req []
          :opt [:Period/id :Period/end :Period/start]))

;; Distance

(s/def ::Distance
  (s/keys :req []
          :opt [:Distance/id :Distance/comparator :Distance/value :Distance/code :Distance/system :Distance/unit]))

;; HumanName

(s/def ::HumanName
  (s/keys :req []
          :opt [:HumanName/suffix :HumanName/use :HumanName/id :HumanName/text :HumanName/prefix :HumanName/given :HumanName/family :HumanName/period]))

;; Identifier

(s/def ::Identifier
  (s/keys :req []
          :opt [:Identifier/id :Identifier/system :Identifier/value :Identifier/period :Identifier/assigner :Identifier/use :Identifier/type]))

;; CodeableConcept

(s/def ::CodeableConcept
  (s/keys :req []
          :opt [:CodeableConcept/id :CodeableConcept/coding :CodeableConcept/text]))

;; Money

(s/def ::Money
  (s/keys :req []
          :opt [:Money/unit :Money/comparator :Money/value :Money/id :Money/code :Money/system]))

;; Duration

(s/def ::Duration
  (s/keys :req []
          :opt [:Duration/code :Duration/system :Duration/value :Duration/comparator :Duration/unit :Duration/id]))

;; Narrative

(s/def ::Narrative
  (s/keys :req [:Narrative/div :Narrative/status]
          :opt [:Narrative/id]))

;; Contributor

(s/def ::Contributor
  (s/keys :req [:Contributor/name :Contributor/type]
          :opt [:Contributor/id :Contributor/contact]))

;; Resource

(s/def ::Resource
  (s/keys :req []
          :opt [:Resource/language :Resource/meta :Resource/id :Resource/implicitRules]))

;; ContactDetail

(s/def ::ContactDetail
  (s/keys :req []
          :opt [:ContactDetail/name :ContactDetail/telecom :ContactDetail/id]))

;; Reference

(s/def ::Reference
  (s/keys :req []
          :opt [:Reference/identifier :Reference/id :Reference/display :Reference/reference]))

;; Count

(s/def ::Count
  (s/keys :req []
          :opt [:Count/id :Count/unit :Count/code :Count/system :Count/value :Count/comparator]))

;; Quantity

(s/def ::Quantity
  (s/keys :req []
          :opt [:Quantity/value :Quantity/id :Quantity/unit :Quantity/comparator :Quantity/system :Quantity/code]))

;; Element

(s/def ::Element
  (s/keys :req []
          :opt [:Element/id]))

;; BackboneElement

(s/def ::BackboneElement
  (s/keys :req []
          :opt [:BackboneElement/id]))

;; ProcedureRequest

(s/def :ProcedureRequest/id ::id)
(s/def :ProcedureRequest/note (s/coll-of ::Annotation))
(s/def :ProcedureRequest/text ::Narrative)
(s/def :ProcedureRequest/relevantHistory (s/coll-of ::Reference))
(s/def :ProcedureRequest/intent ::code)
(s/def :ProcedureRequest/authoredOn ::dateTime)
(s/def :ProcedureRequest/doNotPerform ::boolean)
(s/def :ProcedureRequest/priority ::code)
(s/def :ProcedureRequest/definition (s/coll-of ::Reference))
(s/def :ProcedureRequest/performer ::Reference)
(s/def :ProcedureRequest/identifier (s/coll-of ::Identifier))
(s/def :ProcedureRequest/reasonReference (s/coll-of ::Reference))
(s/def :ProcedureRequest/bodySite (s/coll-of ::CodeableConcept))
(s/def :ProcedureRequest/reasonCode (s/coll-of ::CodeableConcept))
(s/def :ProcedureRequest/implicitRules ::uri)
(s/def :ProcedureRequest/language ::code)
(s/def :ProcedureRequest/status ::code)
(s/def :ProcedureRequest/contained (s/coll-of ::Resource))
(s/def :ProcedureRequest/replaces (s/coll-of ::Reference))
(s/def :ProcedureRequest/meta ::Meta)
(s/def :ProcedureRequest/performerType ::CodeableConcept)
(s/def :ProcedureRequest/specimen (s/coll-of ::Reference))
(s/def :ProcedureRequest/asNeeded ::string)
(s/def :ProcedureRequest/category (s/coll-of ::CodeableConcept))
(s/def :ProcedureRequest/subject ::Reference)
(s/def :ProcedureRequest/supportingInfo (s/coll-of ::Reference))
(s/def :ProcedureRequest/occurrence ::string)
(s/def :ProcedureRequest/code ::CodeableConcept)
(s/def :ProcedureRequest/requisition ::Identifier)
(s/def :ProcedureRequest/basedOn (s/coll-of ::Reference))
(s/def :ProcedureRequest/context ::Reference)
(s/def :ProcedureRequest/requester ::string)


;; DeviceRequest

(s/def :DeviceRequest/priorRequest (s/coll-of ::Reference))
(s/def :DeviceRequest/reasonReference (s/coll-of ::Reference))
(s/def :DeviceRequest/authoredOn ::dateTime)
(s/def :DeviceRequest/text ::Narrative)
(s/def :DeviceRequest/definition (s/coll-of ::Reference))
(s/def :DeviceRequest/performerType ::CodeableConcept)
(s/def :DeviceRequest/supportingInfo (s/coll-of ::Reference))
(s/def :DeviceRequest/id ::id)
(s/def :DeviceRequest/basedOn (s/coll-of ::Reference))
(s/def :DeviceRequest/relevantHistory (s/coll-of ::Reference))
(s/def :DeviceRequest/language ::code)
(s/def :DeviceRequest/code ::string)
(s/def :DeviceRequest/requester ::string)
(s/def :DeviceRequest/status ::code)
(s/def :DeviceRequest/note (s/coll-of ::Annotation))
(s/def :DeviceRequest/intent ::CodeableConcept)
(s/def :DeviceRequest/identifier (s/coll-of ::Identifier))
(s/def :DeviceRequest/context ::Reference)
(s/def :DeviceRequest/contained (s/coll-of ::Resource))
(s/def :DeviceRequest/groupIdentifier ::Identifier)
(s/def :DeviceRequest/implicitRules ::uri)
(s/def :DeviceRequest/subject ::Reference)
(s/def :DeviceRequest/meta ::Meta)
(s/def :DeviceRequest/occurrence ::string)
(s/def :DeviceRequest/priority ::code)
(s/def :DeviceRequest/reasonCode (s/coll-of ::CodeableConcept))
(s/def :DeviceRequest/performer ::Reference)


;; DeviceComponent

(s/def :DeviceComponent/lastSystemChange ::instant)
(s/def :DeviceComponent/language ::code)
(s/def :DeviceComponent/contained (s/coll-of ::Resource))
(s/def :DeviceComponent/parameterGroup ::CodeableConcept)
(s/def :DeviceComponent/languageCode ::CodeableConcept)
(s/def :DeviceComponent/type ::CodeableConcept)
(s/def :DeviceComponent/meta ::Meta)
(s/def :DeviceComponent/operationalStatus (s/coll-of ::CodeableConcept))
(s/def :DeviceComponent/productionSpecification (s/coll-of ::string))
(s/def :DeviceComponent/parent ::Reference)
(s/def :DeviceComponent/measurementPrinciple ::code)
(s/def :DeviceComponent/implicitRules ::uri)
(s/def :DeviceComponent/text ::Narrative)
(s/def :DeviceComponent/id ::id)
(s/def :DeviceComponent/source ::Reference)
(s/def :DeviceComponent/identifier ::Identifier)


;; DeviceMetric

(s/def :DeviceMetric/id ::id)
(s/def :DeviceMetric/unit ::CodeableConcept)
(s/def :DeviceMetric/text ::Narrative)
(s/def :DeviceMetric/parent ::Reference)
(s/def :DeviceMetric/type ::CodeableConcept)
(s/def :DeviceMetric/color ::code)
(s/def :DeviceMetric/source ::Reference)
(s/def :DeviceMetric/operationalStatus ::code)
(s/def :DeviceMetric/implicitRules ::uri)
(s/def :DeviceMetric/measurementPeriod ::Timing)
(s/def :DeviceMetric/identifier ::Identifier)
(s/def :DeviceMetric/calibration (s/coll-of ::string))
(s/def :DeviceMetric/language ::code)
(s/def :DeviceMetric/contained (s/coll-of ::Resource))
(s/def :DeviceMetric/category ::code)
(s/def :DeviceMetric/meta ::Meta)


;; CarePlan

(s/def :CarePlan/definition (s/coll-of ::Reference))
(s/def :CarePlan/period ::Period)
(s/def :CarePlan/context ::Reference)
(s/def :CarePlan/replaces (s/coll-of ::Reference))
(s/def :CarePlan/text ::Narrative)
(s/def :CarePlan/basedOn (s/coll-of ::Reference))
(s/def :CarePlan/author (s/coll-of ::Reference))
(s/def :CarePlan/supportingInfo (s/coll-of ::Reference))
(s/def :CarePlan/addresses (s/coll-of ::Reference))
(s/def :CarePlan/subject ::Reference)
(s/def :CarePlan/description ::string)
(s/def :CarePlan/id ::id)
(s/def :CarePlan/intent ::code)
(s/def :CarePlan/meta ::Meta)
(s/def :CarePlan/title ::string)
(s/def :CarePlan/identifier (s/coll-of ::Identifier))
(s/def :CarePlan/activity (s/coll-of ::string))
(s/def :CarePlan/status ::code)
(s/def :CarePlan/implicitRules ::uri)
(s/def :CarePlan/note (s/coll-of ::Annotation))
(s/def :CarePlan/category (s/coll-of ::CodeableConcept))
(s/def :CarePlan/contained (s/coll-of ::Resource))
(s/def :CarePlan/language ::code)
(s/def :CarePlan/goal (s/coll-of ::Reference))
(s/def :CarePlan/careTeam (s/coll-of ::Reference))
(s/def :CarePlan/partOf (s/coll-of ::Reference))


;; Observation

(s/def :Observation/language ::code)
(s/def :Observation/text ::Narrative)
(s/def :Observation/method ::CodeableConcept)
(s/def :Observation/dataAbsentReason ::CodeableConcept)
(s/def :Observation/subject ::Reference)
(s/def :Observation/code ::CodeableConcept)
(s/def :Observation/basedOn (s/coll-of ::Reference))
(s/def :Observation/specimen ::Reference)
(s/def :Observation/value ::string)
(s/def :Observation/referenceRange (s/coll-of ::string))
(s/def :Observation/id ::id)
(s/def :Observation/issued ::instant)
(s/def :Observation/interpretation ::CodeableConcept)
(s/def :Observation/identifier (s/coll-of ::Identifier))
(s/def :Observation/performer (s/coll-of ::Reference))
(s/def :Observation/contained (s/coll-of ::Resource))
(s/def :Observation/meta ::Meta)
(s/def :Observation/status ::code)
(s/def :Observation/implicitRules ::uri)
(s/def :Observation/related (s/coll-of ::string))
(s/def :Observation/device ::Reference)
(s/def :Observation/effective ::string)
(s/def :Observation/component (s/coll-of ::string))
(s/def :Observation/category (s/coll-of ::CodeableConcept))
(s/def :Observation/comment ::string)
(s/def :Observation/bodySite ::CodeableConcept)
(s/def :Observation/context ::Reference)


;; EnrollmentRequest

(s/def :EnrollmentRequest/subject ::Reference)
(s/def :EnrollmentRequest/language ::code)
(s/def :EnrollmentRequest/identifier (s/coll-of ::Identifier))
(s/def :EnrollmentRequest/provider ::Reference)
(s/def :EnrollmentRequest/meta ::Meta)
(s/def :EnrollmentRequest/id ::id)
(s/def :EnrollmentRequest/contained (s/coll-of ::Resource))
(s/def :EnrollmentRequest/status ::code)
(s/def :EnrollmentRequest/implicitRules ::uri)
(s/def :EnrollmentRequest/coverage ::Reference)
(s/def :EnrollmentRequest/insurer ::Reference)
(s/def :EnrollmentRequest/organization ::Reference)
(s/def :EnrollmentRequest/text ::Narrative)
(s/def :EnrollmentRequest/created ::dateTime)


;; Group

(s/def :Group/type ::code)
(s/def :Group/characteristic (s/coll-of ::string))
(s/def :Group/text ::Narrative)
(s/def :Group/member (s/coll-of ::string))
(s/def :Group/implicitRules ::uri)
(s/def :Group/contained (s/coll-of ::Resource))
(s/def :Group/id ::id)
(s/def :Group/identifier (s/coll-of ::Identifier))
(s/def :Group/language ::code)
(s/def :Group/active ::boolean)
(s/def :Group/code ::CodeableConcept)
(s/def :Group/name ::string)
(s/def :Group/quantity ::unsignedInt)
(s/def :Group/actual ::boolean)
(s/def :Group/meta ::Meta)


;; MessageDefinition

(s/def :MessageDefinition/contact (s/coll-of ::ContactDetail))
(s/def :MessageDefinition/useContext (s/coll-of ::UsageContext))
(s/def :MessageDefinition/status ::code)
(s/def :MessageDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :MessageDefinition/replaces (s/coll-of ::Reference))
(s/def :MessageDefinition/purpose ::markdown)
(s/def :MessageDefinition/experimental ::boolean)
(s/def :MessageDefinition/title ::string)
(s/def :MessageDefinition/base ::Reference)
(s/def :MessageDefinition/name ::string)
(s/def :MessageDefinition/publisher ::string)
(s/def :MessageDefinition/date ::dateTime)
(s/def :MessageDefinition/id ::id)
(s/def :MessageDefinition/category ::code)
(s/def :MessageDefinition/focus (s/coll-of ::string))
(s/def :MessageDefinition/implicitRules ::uri)
(s/def :MessageDefinition/event ::Coding)
(s/def :MessageDefinition/text ::Narrative)
(s/def :MessageDefinition/language ::code)
(s/def :MessageDefinition/version ::string)
(s/def :MessageDefinition/copyright ::markdown)
(s/def :MessageDefinition/parent (s/coll-of ::Reference))
(s/def :MessageDefinition/identifier ::Identifier)
(s/def :MessageDefinition/allowedResponse (s/coll-of ::string))
(s/def :MessageDefinition/contained (s/coll-of ::Resource))
(s/def :MessageDefinition/description ::markdown)
(s/def :MessageDefinition/url ::uri)
(s/def :MessageDefinition/meta ::Meta)
(s/def :MessageDefinition/responseRequired ::boolean)


;; ReferralRequest

(s/def :ReferralRequest/basedOn (s/coll-of ::Reference))
(s/def :ReferralRequest/specialty ::CodeableConcept)
(s/def :ReferralRequest/reasonReference (s/coll-of ::Reference))
(s/def :ReferralRequest/requester ::string)
(s/def :ReferralRequest/status ::code)
(s/def :ReferralRequest/serviceRequested (s/coll-of ::CodeableConcept))
(s/def :ReferralRequest/subject ::Reference)
(s/def :ReferralRequest/note (s/coll-of ::Annotation))
(s/def :ReferralRequest/description ::string)
(s/def :ReferralRequest/id ::id)
(s/def :ReferralRequest/replaces (s/coll-of ::Reference))
(s/def :ReferralRequest/meta ::Meta)
(s/def :ReferralRequest/recipient (s/coll-of ::Reference))
(s/def :ReferralRequest/language ::code)
(s/def :ReferralRequest/occurrence ::string)
(s/def :ReferralRequest/implicitRules ::uri)
(s/def :ReferralRequest/definition (s/coll-of ::Reference))
(s/def :ReferralRequest/context ::Reference)
(s/def :ReferralRequest/priority ::code)
(s/def :ReferralRequest/identifier (s/coll-of ::Identifier))
(s/def :ReferralRequest/groupIdentifier ::Identifier)
(s/def :ReferralRequest/contained (s/coll-of ::Resource))
(s/def :ReferralRequest/intent ::code)
(s/def :ReferralRequest/authoredOn ::dateTime)
(s/def :ReferralRequest/reasonCode (s/coll-of ::CodeableConcept))
(s/def :ReferralRequest/supportingInfo (s/coll-of ::Reference))
(s/def :ReferralRequest/relevantHistory (s/coll-of ::Reference))
(s/def :ReferralRequest/type ::CodeableConcept)
(s/def :ReferralRequest/text ::Narrative)


;; Appointment

(s/def :Appointment/participant (s/coll-of ::string))
(s/def :Appointment/priority ::unsignedInt)
(s/def :Appointment/implicitRules ::uri)
(s/def :Appointment/language ::code)
(s/def :Appointment/end ::instant)
(s/def :Appointment/start ::instant)
(s/def :Appointment/reason (s/coll-of ::CodeableConcept))
(s/def :Appointment/text ::Narrative)
(s/def :Appointment/serviceCategory ::CodeableConcept)
(s/def :Appointment/status ::code)
(s/def :Appointment/serviceType (s/coll-of ::CodeableConcept))
(s/def :Appointment/specialty (s/coll-of ::CodeableConcept))
(s/def :Appointment/indication (s/coll-of ::Reference))
(s/def :Appointment/contained (s/coll-of ::Resource))
(s/def :Appointment/identifier (s/coll-of ::Identifier))
(s/def :Appointment/description ::string)
(s/def :Appointment/requestedPeriod (s/coll-of ::Period))
(s/def :Appointment/appointmentType ::CodeableConcept)
(s/def :Appointment/comment ::string)
(s/def :Appointment/created ::dateTime)
(s/def :Appointment/id ::id)
(s/def :Appointment/incomingReferral (s/coll-of ::Reference))
(s/def :Appointment/minutesDuration ::positiveInt)
(s/def :Appointment/supportingInformation (s/coll-of ::Reference))
(s/def :Appointment/slot (s/coll-of ::Reference))
(s/def :Appointment/meta ::Meta)


;; QuestionnaireResponse

(s/def :QuestionnaireResponse/text ::Narrative)
(s/def :QuestionnaireResponse/contained (s/coll-of ::Resource))
(s/def :QuestionnaireResponse/language ::code)
(s/def :QuestionnaireResponse/context ::Reference)
(s/def :QuestionnaireResponse/subject ::Reference)
(s/def :QuestionnaireResponse/authored ::dateTime)
(s/def :QuestionnaireResponse/identifier ::Identifier)
(s/def :QuestionnaireResponse/source ::Reference)
(s/def :QuestionnaireResponse/id ::id)
(s/def :QuestionnaireResponse/item (s/coll-of ::string))
(s/def :QuestionnaireResponse/basedOn (s/coll-of ::Reference))
(s/def :QuestionnaireResponse/meta ::Meta)
(s/def :QuestionnaireResponse/status ::code)
(s/def :QuestionnaireResponse/implicitRules ::uri)
(s/def :QuestionnaireResponse/parent (s/coll-of ::Reference))
(s/def :QuestionnaireResponse/author ::Reference)
(s/def :QuestionnaireResponse/questionnaire ::Reference)


;; EpisodeOfCare

(s/def :EpisodeOfCare/patient ::Reference)
(s/def :EpisodeOfCare/implicitRules ::uri)
(s/def :EpisodeOfCare/id ::id)
(s/def :EpisodeOfCare/status ::code)
(s/def :EpisodeOfCare/careManager ::Reference)
(s/def :EpisodeOfCare/meta ::Meta)
(s/def :EpisodeOfCare/period ::Period)
(s/def :EpisodeOfCare/account (s/coll-of ::Reference))
(s/def :EpisodeOfCare/identifier (s/coll-of ::Identifier))
(s/def :EpisodeOfCare/managingOrganization ::Reference)
(s/def :EpisodeOfCare/team (s/coll-of ::Reference))
(s/def :EpisodeOfCare/diagnosis (s/coll-of ::string))
(s/def :EpisodeOfCare/type (s/coll-of ::CodeableConcept))
(s/def :EpisodeOfCare/referralRequest (s/coll-of ::Reference))
(s/def :EpisodeOfCare/contained (s/coll-of ::Resource))
(s/def :EpisodeOfCare/language ::code)
(s/def :EpisodeOfCare/text ::Narrative)
(s/def :EpisodeOfCare/statusHistory (s/coll-of ::string))


;; ProcessResponse

(s/def :ProcessResponse/requestOrganization ::Reference)
(s/def :ProcessResponse/meta ::Meta)
(s/def :ProcessResponse/form ::CodeableConcept)
(s/def :ProcessResponse/error (s/coll-of ::CodeableConcept))
(s/def :ProcessResponse/identifier (s/coll-of ::Identifier))
(s/def :ProcessResponse/disposition ::string)
(s/def :ProcessResponse/outcome ::CodeableConcept)
(s/def :ProcessResponse/processNote (s/coll-of ::string))
(s/def :ProcessResponse/id ::id)
(s/def :ProcessResponse/requestProvider ::Reference)
(s/def :ProcessResponse/organization ::Reference)
(s/def :ProcessResponse/status ::code)
(s/def :ProcessResponse/text ::Narrative)
(s/def :ProcessResponse/request ::Reference)
(s/def :ProcessResponse/language ::code)
(s/def :ProcessResponse/implicitRules ::uri)
(s/def :ProcessResponse/created ::dateTime)
(s/def :ProcessResponse/communicationRequest (s/coll-of ::Reference))
(s/def :ProcessResponse/contained (s/coll-of ::Resource))


;; SupplyDelivery

(s/def :SupplyDelivery/suppliedItem ::string)
(s/def :SupplyDelivery/status ::code)
(s/def :SupplyDelivery/occurrence ::string)
(s/def :SupplyDelivery/type ::CodeableConcept)
(s/def :SupplyDelivery/implicitRules ::uri)
(s/def :SupplyDelivery/identifier ::Identifier)
(s/def :SupplyDelivery/text ::Narrative)
(s/def :SupplyDelivery/id ::id)
(s/def :SupplyDelivery/meta ::Meta)
(s/def :SupplyDelivery/receiver (s/coll-of ::Reference))
(s/def :SupplyDelivery/contained (s/coll-of ::Resource))
(s/def :SupplyDelivery/language ::code)
(s/def :SupplyDelivery/destination ::Reference)
(s/def :SupplyDelivery/partOf (s/coll-of ::Reference))
(s/def :SupplyDelivery/supplier ::Reference)
(s/def :SupplyDelivery/basedOn (s/coll-of ::Reference))
(s/def :SupplyDelivery/patient ::Reference)


;; AdverseEvent

(s/def :AdverseEvent/description ::string)
(s/def :AdverseEvent/text ::Narrative)
(s/def :AdverseEvent/reaction (s/coll-of ::Reference))
(s/def :AdverseEvent/meta ::Meta)
(s/def :AdverseEvent/category ::code)
(s/def :AdverseEvent/referenceDocument (s/coll-of ::Reference))
(s/def :AdverseEvent/suspectEntity (s/coll-of ::string))
(s/def :AdverseEvent/recorder ::Reference)
(s/def :AdverseEvent/implicitRules ::uri)
(s/def :AdverseEvent/id ::id)
(s/def :AdverseEvent/outcome ::CodeableConcept)
(s/def :AdverseEvent/contained (s/coll-of ::Resource))
(s/def :AdverseEvent/seriousness ::CodeableConcept)
(s/def :AdverseEvent/type ::CodeableConcept)
(s/def :AdverseEvent/location ::Reference)
(s/def :AdverseEvent/identifier ::Identifier)
(s/def :AdverseEvent/date ::dateTime)
(s/def :AdverseEvent/language ::code)
(s/def :AdverseEvent/subject ::Reference)
(s/def :AdverseEvent/subjectMedicalHistory (s/coll-of ::Reference))
(s/def :AdverseEvent/eventParticipant ::Reference)
(s/def :AdverseEvent/study (s/coll-of ::Reference))


;; Endpoint

(s/def :Endpoint/contained (s/coll-of ::Resource))
(s/def :Endpoint/connectionType ::Coding)
(s/def :Endpoint/language ::code)
(s/def :Endpoint/implicitRules ::uri)
(s/def :Endpoint/payloadType (s/coll-of ::CodeableConcept))
(s/def :Endpoint/managingOrganization ::Reference)
(s/def :Endpoint/name ::string)
(s/def :Endpoint/contact (s/coll-of ::ContactPoint))
(s/def :Endpoint/address ::uri)
(s/def :Endpoint/id ::id)
(s/def :Endpoint/text ::Narrative)
(s/def :Endpoint/status ::code)
(s/def :Endpoint/payloadMimeType (s/coll-of ::code))
(s/def :Endpoint/identifier (s/coll-of ::Identifier))
(s/def :Endpoint/period ::Period)
(s/def :Endpoint/meta ::Meta)
(s/def :Endpoint/header (s/coll-of ::string))


;; CompartmentDefinition

(s/def :CompartmentDefinition/useContext (s/coll-of ::UsageContext))
(s/def :CompartmentDefinition/purpose ::markdown)
(s/def :CompartmentDefinition/description ::markdown)
(s/def :CompartmentDefinition/text ::Narrative)
(s/def :CompartmentDefinition/name ::string)
(s/def :CompartmentDefinition/resource (s/coll-of ::string))
(s/def :CompartmentDefinition/contained (s/coll-of ::Resource))
(s/def :CompartmentDefinition/contact (s/coll-of ::ContactDetail))
(s/def :CompartmentDefinition/title ::string)
(s/def :CompartmentDefinition/url ::uri)
(s/def :CompartmentDefinition/search ::boolean)
(s/def :CompartmentDefinition/language ::code)
(s/def :CompartmentDefinition/status ::code)
(s/def :CompartmentDefinition/implicitRules ::uri)
(s/def :CompartmentDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :CompartmentDefinition/code ::code)
(s/def :CompartmentDefinition/publisher ::string)
(s/def :CompartmentDefinition/experimental ::boolean)
(s/def :CompartmentDefinition/date ::dateTime)
(s/def :CompartmentDefinition/meta ::Meta)
(s/def :CompartmentDefinition/id ::id)


;; DetectedIssue

(s/def :DetectedIssue/category ::CodeableConcept)
(s/def :DetectedIssue/language ::code)
(s/def :DetectedIssue/implicitRules ::uri)
(s/def :DetectedIssue/patient ::Reference)
(s/def :DetectedIssue/contained (s/coll-of ::Resource))
(s/def :DetectedIssue/author ::Reference)
(s/def :DetectedIssue/status ::code)
(s/def :DetectedIssue/mitigation (s/coll-of ::string))
(s/def :DetectedIssue/text ::Narrative)
(s/def :DetectedIssue/reference ::uri)
(s/def :DetectedIssue/meta ::Meta)
(s/def :DetectedIssue/id ::id)
(s/def :DetectedIssue/detail ::string)
(s/def :DetectedIssue/severity ::code)
(s/def :DetectedIssue/date ::dateTime)
(s/def :DetectedIssue/identifier ::Identifier)
(s/def :DetectedIssue/implicated (s/coll-of ::Reference))


;; MedicationAdministration

(s/def :MedicationAdministration/reasonNotGiven (s/coll-of ::CodeableConcept))
(s/def :MedicationAdministration/status ::code)
(s/def :MedicationAdministration/partOf (s/coll-of ::Reference))
(s/def :MedicationAdministration/implicitRules ::uri)
(s/def :MedicationAdministration/performer (s/coll-of ::string))
(s/def :MedicationAdministration/reasonCode (s/coll-of ::CodeableConcept))
(s/def :MedicationAdministration/notGiven ::boolean)
(s/def :MedicationAdministration/reasonReference (s/coll-of ::Reference))
(s/def :MedicationAdministration/context ::Reference)
(s/def :MedicationAdministration/device (s/coll-of ::Reference))
(s/def :MedicationAdministration/meta ::Meta)
(s/def :MedicationAdministration/identifier (s/coll-of ::Identifier))
(s/def :MedicationAdministration/prescription ::Reference)
(s/def :MedicationAdministration/eventHistory (s/coll-of ::Reference))
(s/def :MedicationAdministration/text ::Narrative)
(s/def :MedicationAdministration/subject ::Reference)
(s/def :MedicationAdministration/effective ::string)
(s/def :MedicationAdministration/medication ::string)
(s/def :MedicationAdministration/category ::CodeableConcept)
(s/def :MedicationAdministration/supportingInformation (s/coll-of ::Reference))
(s/def :MedicationAdministration/contained (s/coll-of ::Resource))
(s/def :MedicationAdministration/id ::id)
(s/def :MedicationAdministration/definition (s/coll-of ::Reference))
(s/def :MedicationAdministration/note (s/coll-of ::Annotation))
(s/def :MedicationAdministration/language ::code)
(s/def :MedicationAdministration/dosage ::string)


;; ImplementationGuide

(s/def :ImplementationGuide/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :ImplementationGuide/publisher ::string)
(s/def :ImplementationGuide/fhirVersion ::id)
(s/def :ImplementationGuide/dependency (s/coll-of ::string))
(s/def :ImplementationGuide/copyright ::markdown)
(s/def :ImplementationGuide/description ::markdown)
(s/def :ImplementationGuide/contained (s/coll-of ::Resource))
(s/def :ImplementationGuide/experimental ::boolean)
(s/def :ImplementationGuide/date ::dateTime)
(s/def :ImplementationGuide/language ::code)
(s/def :ImplementationGuide/name ::string)
(s/def :ImplementationGuide/id ::id)
(s/def :ImplementationGuide/text ::Narrative)
(s/def :ImplementationGuide/page ::string)
(s/def :ImplementationGuide/contact (s/coll-of ::ContactDetail))
(s/def :ImplementationGuide/useContext (s/coll-of ::UsageContext))
(s/def :ImplementationGuide/version ::string)
(s/def :ImplementationGuide/package (s/coll-of ::string))
(s/def :ImplementationGuide/global (s/coll-of ::string))
(s/def :ImplementationGuide/url ::uri)
(s/def :ImplementationGuide/implicitRules ::uri)
(s/def :ImplementationGuide/status ::code)
(s/def :ImplementationGuide/meta ::Meta)
(s/def :ImplementationGuide/binary (s/coll-of ::uri))


;; Goal

(s/def :Goal/identifier (s/coll-of ::Identifier))
(s/def :Goal/outcomeCode (s/coll-of ::CodeableConcept))
(s/def :Goal/addresses (s/coll-of ::Reference))
(s/def :Goal/status ::code)
(s/def :Goal/expressedBy ::Reference)
(s/def :Goal/note (s/coll-of ::Annotation))
(s/def :Goal/outcomeReference (s/coll-of ::Reference))
(s/def :Goal/statusDate ::date)
(s/def :Goal/statusReason ::string)
(s/def :Goal/start ::string)
(s/def :Goal/target ::string)
(s/def :Goal/description ::CodeableConcept)
(s/def :Goal/contained (s/coll-of ::Resource))
(s/def :Goal/category (s/coll-of ::CodeableConcept))
(s/def :Goal/language ::code)
(s/def :Goal/priority ::CodeableConcept)
(s/def :Goal/subject ::Reference)
(s/def :Goal/implicitRules ::uri)
(s/def :Goal/text ::Narrative)
(s/def :Goal/id ::id)
(s/def :Goal/meta ::Meta)


;; Communication

(s/def :Communication/notDoneReason ::CodeableConcept)
(s/def :Communication/status ::code)
(s/def :Communication/implicitRules ::uri)
(s/def :Communication/subject ::Reference)
(s/def :Communication/contained (s/coll-of ::Resource))
(s/def :Communication/topic (s/coll-of ::Reference))
(s/def :Communication/medium (s/coll-of ::CodeableConcept))
(s/def :Communication/partOf (s/coll-of ::Reference))
(s/def :Communication/meta ::Meta)
(s/def :Communication/reasonCode (s/coll-of ::CodeableConcept))
(s/def :Communication/identifier (s/coll-of ::Identifier))
(s/def :Communication/definition (s/coll-of ::Reference))
(s/def :Communication/reasonReference (s/coll-of ::Reference))
(s/def :Communication/notDone ::boolean)
(s/def :Communication/received ::dateTime)
(s/def :Communication/language ::code)
(s/def :Communication/recipient (s/coll-of ::Reference))
(s/def :Communication/category (s/coll-of ::CodeableConcept))
(s/def :Communication/text ::Narrative)
(s/def :Communication/payload (s/coll-of ::string))
(s/def :Communication/note (s/coll-of ::Annotation))
(s/def :Communication/sent ::dateTime)
(s/def :Communication/basedOn (s/coll-of ::Reference))
(s/def :Communication/sender ::Reference)
(s/def :Communication/context ::Reference)
(s/def :Communication/id ::id)


;; Schedule

(s/def :Schedule/id ::id)
(s/def :Schedule/contained (s/coll-of ::Resource))
(s/def :Schedule/actor (s/coll-of ::Reference))
(s/def :Schedule/serviceType (s/coll-of ::CodeableConcept))
(s/def :Schedule/meta ::Meta)
(s/def :Schedule/identifier (s/coll-of ::Identifier))
(s/def :Schedule/language ::code)
(s/def :Schedule/active ::boolean)
(s/def :Schedule/serviceCategory ::CodeableConcept)
(s/def :Schedule/planningHorizon ::Period)
(s/def :Schedule/implicitRules ::uri)
(s/def :Schedule/specialty (s/coll-of ::CodeableConcept))
(s/def :Schedule/comment ::string)
(s/def :Schedule/text ::Narrative)


;; DocumentReference

(s/def :DocumentReference/content (s/coll-of ::string))
(s/def :DocumentReference/created ::dateTime)
(s/def :DocumentReference/meta ::Meta)
(s/def :DocumentReference/authenticator ::Reference)
(s/def :DocumentReference/contained (s/coll-of ::Resource))
(s/def :DocumentReference/description ::string)
(s/def :DocumentReference/language ::code)
(s/def :DocumentReference/subject ::Reference)
(s/def :DocumentReference/context ::string)
(s/def :DocumentReference/implicitRules ::uri)
(s/def :DocumentReference/identifier (s/coll-of ::Identifier))
(s/def :DocumentReference/relatesTo (s/coll-of ::string))
(s/def :DocumentReference/status ::code)
(s/def :DocumentReference/text ::Narrative)
(s/def :DocumentReference/class ::CodeableConcept)
(s/def :DocumentReference/id ::id)
(s/def :DocumentReference/indexed ::instant)
(s/def :DocumentReference/securityLabel (s/coll-of ::CodeableConcept))
(s/def :DocumentReference/custodian ::Reference)
(s/def :DocumentReference/docStatus ::code)
(s/def :DocumentReference/author (s/coll-of ::Reference))
(s/def :DocumentReference/type ::CodeableConcept)
(s/def :DocumentReference/masterIdentifier ::Identifier)


;; Coverage

(s/def :Coverage/payor (s/coll-of ::Reference))
(s/def :Coverage/policyHolder ::Reference)
(s/def :Coverage/relationship ::CodeableConcept)
(s/def :Coverage/type ::CodeableConcept)
(s/def :Coverage/sequence ::string)
(s/def :Coverage/language ::code)
(s/def :Coverage/dependent ::string)
(s/def :Coverage/beneficiary ::Reference)
(s/def :Coverage/subscriber ::Reference)
(s/def :Coverage/contract (s/coll-of ::Reference))
(s/def :Coverage/text ::Narrative)
(s/def :Coverage/meta ::Meta)
(s/def :Coverage/grouping ::string)
(s/def :Coverage/implicitRules ::uri)
(s/def :Coverage/contained (s/coll-of ::Resource))
(s/def :Coverage/network ::string)
(s/def :Coverage/subscriberId ::string)
(s/def :Coverage/order ::positiveInt)
(s/def :Coverage/id ::id)
(s/def :Coverage/identifier (s/coll-of ::Identifier))
(s/def :Coverage/period ::Period)
(s/def :Coverage/status ::code)


;; AuditEvent

(s/def :AuditEvent/implicitRules ::uri)
(s/def :AuditEvent/outcomeDesc ::string)
(s/def :AuditEvent/entity (s/coll-of ::string))
(s/def :AuditEvent/subtype (s/coll-of ::Coding))
(s/def :AuditEvent/text ::Narrative)
(s/def :AuditEvent/agent (s/coll-of ::string))
(s/def :AuditEvent/outcome ::code)
(s/def :AuditEvent/meta ::Meta)
(s/def :AuditEvent/purposeOfEvent (s/coll-of ::CodeableConcept))
(s/def :AuditEvent/recorded ::instant)
(s/def :AuditEvent/language ::code)
(s/def :AuditEvent/id ::id)
(s/def :AuditEvent/contained (s/coll-of ::Resource))
(s/def :AuditEvent/type ::Coding)
(s/def :AuditEvent/source ::string)
(s/def :AuditEvent/action ::code)


;; MessageHeader

(s/def :MessageHeader/enterer ::Reference)
(s/def :MessageHeader/author ::Reference)
(s/def :MessageHeader/id ::id)
(s/def :MessageHeader/source ::string)
(s/def :MessageHeader/event ::Coding)
(s/def :MessageHeader/focus (s/coll-of ::Reference))
(s/def :MessageHeader/contained (s/coll-of ::Resource))
(s/def :MessageHeader/implicitRules ::uri)
(s/def :MessageHeader/text ::Narrative)
(s/def :MessageHeader/sender ::Reference)
(s/def :MessageHeader/response ::string)
(s/def :MessageHeader/receiver ::Reference)
(s/def :MessageHeader/reason ::CodeableConcept)
(s/def :MessageHeader/destination (s/coll-of ::string))
(s/def :MessageHeader/meta ::Meta)
(s/def :MessageHeader/timestamp ::instant)
(s/def :MessageHeader/language ::code)
(s/def :MessageHeader/responsible ::Reference)


;; Contract

(s/def :Contract/issued ::dateTime)
(s/def :Contract/contained (s/coll-of ::Resource))
(s/def :Contract/applies ::Period)
(s/def :Contract/meta ::Meta)
(s/def :Contract/agent (s/coll-of ::string))
(s/def :Contract/type ::CodeableConcept)
(s/def :Contract/friendly (s/coll-of ::string))
(s/def :Contract/id ::id)
(s/def :Contract/text ::Narrative)
(s/def :Contract/actionReason (s/coll-of ::CodeableConcept))
(s/def :Contract/signer (s/coll-of ::string))
(s/def :Contract/binding ::string)
(s/def :Contract/legal (s/coll-of ::string))
(s/def :Contract/rule (s/coll-of ::string))
(s/def :Contract/language ::code)
(s/def :Contract/securityLabel (s/coll-of ::Coding))
(s/def :Contract/subType (s/coll-of ::CodeableConcept))
(s/def :Contract/decisionType ::CodeableConcept)
(s/def :Contract/implicitRules ::uri)
(s/def :Contract/domain (s/coll-of ::Reference))
(s/def :Contract/valuedItem (s/coll-of ::string))
(s/def :Contract/subject (s/coll-of ::Reference))
(s/def :Contract/identifier ::Identifier)
(s/def :Contract/status ::code)
(s/def :Contract/topic (s/coll-of ::Reference))
(s/def :Contract/contentDerivative ::CodeableConcept)
(s/def :Contract/action (s/coll-of ::CodeableConcept))
(s/def :Contract/authority (s/coll-of ::Reference))
(s/def :Contract/term (s/coll-of ::string))


;; Sequence

(s/def :Sequence/type ::code)
(s/def :Sequence/device ::Reference)
(s/def :Sequence/observedSeq ::string)
(s/def :Sequence/readCoverage ::integer)
(s/def :Sequence/meta ::Meta)
(s/def :Sequence/quality (s/coll-of ::string))
(s/def :Sequence/referenceSeq ::string)
(s/def :Sequence/variant (s/coll-of ::string))
(s/def :Sequence/contained (s/coll-of ::Resource))
(s/def :Sequence/identifier (s/coll-of ::Identifier))
(s/def :Sequence/repository (s/coll-of ::string))
(s/def :Sequence/quantity ::Quantity)
(s/def :Sequence/text ::Narrative)
(s/def :Sequence/coordinateSystem ::integer)
(s/def :Sequence/id ::id)
(s/def :Sequence/patient ::Reference)
(s/def :Sequence/performer ::Reference)
(s/def :Sequence/specimen ::Reference)
(s/def :Sequence/language ::code)
(s/def :Sequence/implicitRules ::uri)
(s/def :Sequence/pointer (s/coll-of ::Reference))


;; DataElement

(s/def :DataElement/status ::code)
(s/def :DataElement/id ::id)
(s/def :DataElement/useContext (s/coll-of ::UsageContext))
(s/def :DataElement/text ::Narrative)
(s/def :DataElement/stringency ::code)
(s/def :DataElement/contact (s/coll-of ::ContactDetail))
(s/def :DataElement/implicitRules ::uri)
(s/def :DataElement/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :DataElement/element (s/coll-of ::ElementDefinition))
(s/def :DataElement/publisher ::string)
(s/def :DataElement/url ::uri)
(s/def :DataElement/meta ::Meta)
(s/def :DataElement/version ::string)
(s/def :DataElement/language ::code)
(s/def :DataElement/mapping (s/coll-of ::string))
(s/def :DataElement/title ::string)
(s/def :DataElement/date ::dateTime)
(s/def :DataElement/contained (s/coll-of ::Resource))
(s/def :DataElement/name ::string)
(s/def :DataElement/copyright ::markdown)
(s/def :DataElement/experimental ::boolean)
(s/def :DataElement/identifier (s/coll-of ::Identifier))


;; CodeSystem

(s/def :CodeSystem/compositional ::boolean)
(s/def :CodeSystem/publisher ::string)
(s/def :CodeSystem/count ::unsignedInt)
(s/def :CodeSystem/purpose ::markdown)
(s/def :CodeSystem/url ::uri)
(s/def :CodeSystem/experimental ::boolean)
(s/def :CodeSystem/copyright ::markdown)
(s/def :CodeSystem/versionNeeded ::boolean)
(s/def :CodeSystem/content ::code)
(s/def :CodeSystem/contained (s/coll-of ::Resource))
(s/def :CodeSystem/title ::string)
(s/def :CodeSystem/status ::code)
(s/def :CodeSystem/implicitRules ::uri)
(s/def :CodeSystem/caseSensitive ::boolean)
(s/def :CodeSystem/identifier ::Identifier)
(s/def :CodeSystem/id ::id)
(s/def :CodeSystem/filter (s/coll-of ::string))
(s/def :CodeSystem/description ::markdown)
(s/def :CodeSystem/version ::string)
(s/def :CodeSystem/concept (s/coll-of ::string))
(s/def :CodeSystem/useContext (s/coll-of ::UsageContext))
(s/def :CodeSystem/contact (s/coll-of ::ContactDetail))
(s/def :CodeSystem/property (s/coll-of ::string))
(s/def :CodeSystem/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :CodeSystem/language ::code)
(s/def :CodeSystem/text ::Narrative)
(s/def :CodeSystem/valueSet ::uri)
(s/def :CodeSystem/meta ::Meta)
(s/def :CodeSystem/hierarchyMeaning ::code)
(s/def :CodeSystem/date ::dateTime)
(s/def :CodeSystem/name ::string)


;; PlanDefinition

(s/def :PlanDefinition/lastReviewDate ::date)
(s/def :PlanDefinition/type ::CodeableConcept)
(s/def :PlanDefinition/usage ::string)
(s/def :PlanDefinition/text ::Narrative)
(s/def :PlanDefinition/date ::dateTime)
(s/def :PlanDefinition/id ::id)
(s/def :PlanDefinition/relatedArtifact (s/coll-of ::RelatedArtifact))
(s/def :PlanDefinition/language ::code)
(s/def :PlanDefinition/url ::uri)
(s/def :PlanDefinition/useContext (s/coll-of ::UsageContext))
(s/def :PlanDefinition/implicitRules ::uri)
(s/def :PlanDefinition/copyright ::markdown)
(s/def :PlanDefinition/effectivePeriod ::Period)
(s/def :PlanDefinition/title ::string)
(s/def :PlanDefinition/topic (s/coll-of ::CodeableConcept))
(s/def :PlanDefinition/meta ::Meta)
(s/def :PlanDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :PlanDefinition/identifier (s/coll-of ::Identifier))
(s/def :PlanDefinition/action (s/coll-of ::string))
(s/def :PlanDefinition/contributor (s/coll-of ::Contributor))
(s/def :PlanDefinition/name ::string)
(s/def :PlanDefinition/contact (s/coll-of ::ContactDetail))
(s/def :PlanDefinition/goal (s/coll-of ::string))
(s/def :PlanDefinition/publisher ::string)
(s/def :PlanDefinition/version ::string)
(s/def :PlanDefinition/library (s/coll-of ::Reference))
(s/def :PlanDefinition/purpose ::markdown)
(s/def :PlanDefinition/experimental ::boolean)
(s/def :PlanDefinition/description ::markdown)
(s/def :PlanDefinition/status ::code)
(s/def :PlanDefinition/contained (s/coll-of ::Resource))
(s/def :PlanDefinition/approvalDate ::date)


;; ClaimResponse

(s/def :ClaimResponse/request ::Reference)
(s/def :ClaimResponse/identifier (s/coll-of ::Identifier))
(s/def :ClaimResponse/totalCost ::Money)
(s/def :ClaimResponse/requestProvider ::Reference)
(s/def :ClaimResponse/communicationRequest (s/coll-of ::Reference))
(s/def :ClaimResponse/text ::Narrative)
(s/def :ClaimResponse/reserved ::Coding)
(s/def :ClaimResponse/status ::code)
(s/def :ClaimResponse/outcome ::CodeableConcept)
(s/def :ClaimResponse/payeeType ::CodeableConcept)
(s/def :ClaimResponse/id ::id)
(s/def :ClaimResponse/form ::CodeableConcept)
(s/def :ClaimResponse/language ::code)
(s/def :ClaimResponse/totalBenefit ::Money)
(s/def :ClaimResponse/payment ::string)
(s/def :ClaimResponse/item (s/coll-of ::string))
(s/def :ClaimResponse/created ::dateTime)
(s/def :ClaimResponse/processNote (s/coll-of ::string))
(s/def :ClaimResponse/patient ::Reference)
(s/def :ClaimResponse/addItem (s/coll-of ::string))
(s/def :ClaimResponse/contained (s/coll-of ::Resource))
(s/def :ClaimResponse/error (s/coll-of ::string))
(s/def :ClaimResponse/implicitRules ::uri)
(s/def :ClaimResponse/requestOrganization ::Reference)
(s/def :ClaimResponse/unallocDeductable ::Money)
(s/def :ClaimResponse/disposition ::string)
(s/def :ClaimResponse/insurance (s/coll-of ::string))
(s/def :ClaimResponse/insurer ::Reference)
(s/def :ClaimResponse/meta ::Meta)


;; ChargeItem

(s/def :ChargeItem/meta ::Meta)
(s/def :ChargeItem/status ::code)
(s/def :ChargeItem/quantity ::Quantity)
(s/def :ChargeItem/service (s/coll-of ::Reference))
(s/def :ChargeItem/overrideReason ::string)
(s/def :ChargeItem/factorOverride ::decimal)
(s/def :ChargeItem/code ::CodeableConcept)
(s/def :ChargeItem/partOf (s/coll-of ::Reference))
(s/def :ChargeItem/identifier ::Identifier)
(s/def :ChargeItem/bodysite (s/coll-of ::CodeableConcept))
(s/def :ChargeItem/priceOverride ::Money)
(s/def :ChargeItem/occurrence ::string)
(s/def :ChargeItem/enteredDate ::dateTime)
(s/def :ChargeItem/requestingOrganization ::Reference)
(s/def :ChargeItem/account (s/coll-of ::Reference))
(s/def :ChargeItem/id ::id)
(s/def :ChargeItem/implicitRules ::uri)
(s/def :ChargeItem/context ::Reference)
(s/def :ChargeItem/supportingInformation (s/coll-of ::Reference))
(s/def :ChargeItem/enterer ::Reference)
(s/def :ChargeItem/definition (s/coll-of ::uri))
(s/def :ChargeItem/note (s/coll-of ::Annotation))
(s/def :ChargeItem/text ::Narrative)
(s/def :ChargeItem/language ::code)
(s/def :ChargeItem/contained (s/coll-of ::Resource))
(s/def :ChargeItem/participant (s/coll-of ::string))
(s/def :ChargeItem/subject ::Reference)
(s/def :ChargeItem/performingOrganization ::Reference)
(s/def :ChargeItem/reason (s/coll-of ::CodeableConcept))


;; Parameters

(s/def :Parameters/parameter (s/coll-of ::string))
(s/def :Parameters/id ::id)
(s/def :Parameters/meta ::Meta)
(s/def :Parameters/implicitRules ::uri)
(s/def :Parameters/language ::code)


;; ClinicalImpression

(s/def :ClinicalImpression/assessor ::Reference)
(s/def :ClinicalImpression/effective ::string)
(s/def :ClinicalImpression/date ::dateTime)
(s/def :ClinicalImpression/context ::Reference)
(s/def :ClinicalImpression/protocol (s/coll-of ::uri))
(s/def :ClinicalImpression/contained (s/coll-of ::Resource))
(s/def :ClinicalImpression/identifier (s/coll-of ::Identifier))
(s/def :ClinicalImpression/meta ::Meta)
(s/def :ClinicalImpression/status ::code)
(s/def :ClinicalImpression/finding (s/coll-of ::string))
(s/def :ClinicalImpression/note (s/coll-of ::Annotation))
(s/def :ClinicalImpression/id ::id)
(s/def :ClinicalImpression/summary ::string)
(s/def :ClinicalImpression/problem (s/coll-of ::Reference))
(s/def :ClinicalImpression/investigation (s/coll-of ::string))
(s/def :ClinicalImpression/text ::Narrative)
(s/def :ClinicalImpression/action (s/coll-of ::Reference))
(s/def :ClinicalImpression/previous ::Reference)
(s/def :ClinicalImpression/prognosisReference (s/coll-of ::Reference))
(s/def :ClinicalImpression/language ::code)
(s/def :ClinicalImpression/implicitRules ::uri)
(s/def :ClinicalImpression/subject ::Reference)
(s/def :ClinicalImpression/description ::string)
(s/def :ClinicalImpression/prognosisCodeableConcept (s/coll-of ::CodeableConcept))
(s/def :ClinicalImpression/code ::CodeableConcept)


;; FamilyMemberHistory

(s/def :FamilyMemberHistory/notDoneReason ::CodeableConcept)
(s/def :FamilyMemberHistory/deceased ::string)
(s/def :FamilyMemberHistory/note (s/coll-of ::Annotation))
(s/def :FamilyMemberHistory/estimatedAge ::boolean)
(s/def :FamilyMemberHistory/implicitRules ::uri)
(s/def :FamilyMemberHistory/reasonReference (s/coll-of ::Reference))
(s/def :FamilyMemberHistory/name ::string)
(s/def :FamilyMemberHistory/notDone ::boolean)
(s/def :FamilyMemberHistory/relationship ::CodeableConcept)
(s/def :FamilyMemberHistory/age ::string)
(s/def :FamilyMemberHistory/patient ::Reference)
(s/def :FamilyMemberHistory/date ::dateTime)
(s/def :FamilyMemberHistory/id ::id)
(s/def :FamilyMemberHistory/status ::code)
(s/def :FamilyMemberHistory/born ::string)
(s/def :FamilyMemberHistory/reasonCode (s/coll-of ::CodeableConcept))
(s/def :FamilyMemberHistory/language ::code)
(s/def :FamilyMemberHistory/text ::Narrative)
(s/def :FamilyMemberHistory/contained (s/coll-of ::Resource))
(s/def :FamilyMemberHistory/definition (s/coll-of ::Reference))
(s/def :FamilyMemberHistory/condition (s/coll-of ::string))
(s/def :FamilyMemberHistory/gender ::code)
(s/def :FamilyMemberHistory/identifier (s/coll-of ::Identifier))
(s/def :FamilyMemberHistory/meta ::Meta)


;; Binary

(s/def :Binary/id ::id)
(s/def :Binary/language ::code)
(s/def :Binary/content ::base64Binary)
(s/def :Binary/securityContext ::Reference)
(s/def :Binary/implicitRules ::uri)
(s/def :Binary/contentType ::code)
(s/def :Binary/meta ::Meta)


;; Composition

(s/def :Composition/confidentiality ::code)
(s/def :Composition/text ::Narrative)
(s/def :Composition/meta ::Meta)
(s/def :Composition/section (s/coll-of ::string))
(s/def :Composition/implicitRules ::uri)
(s/def :Composition/status ::code)
(s/def :Composition/subject ::Reference)
(s/def :Composition/event (s/coll-of ::string))
(s/def :Composition/contained (s/coll-of ::Resource))
(s/def :Composition/relatesTo (s/coll-of ::string))
(s/def :Composition/type ::CodeableConcept)
(s/def :Composition/id ::id)
(s/def :Composition/identifier ::Identifier)
(s/def :Composition/custodian ::Reference)
(s/def :Composition/language ::code)
(s/def :Composition/attester (s/coll-of ::string))
(s/def :Composition/date ::dateTime)
(s/def :Composition/author (s/coll-of ::Reference))
(s/def :Composition/class ::CodeableConcept)
(s/def :Composition/title ::string)
(s/def :Composition/encounter ::Reference)


;; PractitionerRole

(s/def :PractitionerRole/implicitRules ::uri)
(s/def :PractitionerRole/endpoint (s/coll-of ::Reference))
(s/def :PractitionerRole/contained (s/coll-of ::Resource))
(s/def :PractitionerRole/meta ::Meta)
(s/def :PractitionerRole/healthcareService (s/coll-of ::Reference))
(s/def :PractitionerRole/text ::Narrative)
(s/def :PractitionerRole/organization ::Reference)
(s/def :PractitionerRole/notAvailable (s/coll-of ::string))
(s/def :PractitionerRole/active ::boolean)
(s/def :PractitionerRole/language ::code)
(s/def :PractitionerRole/code (s/coll-of ::CodeableConcept))
(s/def :PractitionerRole/availableTime (s/coll-of ::string))
(s/def :PractitionerRole/period ::Period)
(s/def :PractitionerRole/practitioner ::Reference)
(s/def :PractitionerRole/identifier (s/coll-of ::Identifier))
(s/def :PractitionerRole/specialty (s/coll-of ::CodeableConcept))
(s/def :PractitionerRole/availabilityExceptions ::string)
(s/def :PractitionerRole/location (s/coll-of ::Reference))
(s/def :PractitionerRole/id ::id)
(s/def :PractitionerRole/telecom (s/coll-of ::ContactPoint))


;; HealthcareService

(s/def :HealthcareService/active ::boolean)
(s/def :HealthcareService/id ::id)
(s/def :HealthcareService/providedBy ::Reference)
(s/def :HealthcareService/availabilityExceptions ::string)
(s/def :HealthcareService/location (s/coll-of ::Reference))
(s/def :HealthcareService/referralMethod (s/coll-of ::CodeableConcept))
(s/def :HealthcareService/endpoint (s/coll-of ::Reference))
(s/def :HealthcareService/coverageArea (s/coll-of ::Reference))
(s/def :HealthcareService/implicitRules ::uri)
(s/def :HealthcareService/availableTime (s/coll-of ::string))
(s/def :HealthcareService/language ::code)
(s/def :HealthcareService/extraDetails ::string)
(s/def :HealthcareService/eligibilityNote ::string)
(s/def :HealthcareService/comment ::string)
(s/def :HealthcareService/appointmentRequired ::boolean)
(s/def :HealthcareService/contained (s/coll-of ::Resource))
(s/def :HealthcareService/notAvailable (s/coll-of ::string))
(s/def :HealthcareService/photo ::Attachment)
(s/def :HealthcareService/serviceProvisionCode (s/coll-of ::CodeableConcept))
(s/def :HealthcareService/programName (s/coll-of ::string))
(s/def :HealthcareService/meta ::Meta)
(s/def :HealthcareService/eligibility ::CodeableConcept)
(s/def :HealthcareService/identifier (s/coll-of ::Identifier))
(s/def :HealthcareService/type (s/coll-of ::CodeableConcept))
(s/def :HealthcareService/text ::Narrative)
(s/def :HealthcareService/characteristic (s/coll-of ::CodeableConcept))
(s/def :HealthcareService/category ::CodeableConcept)
(s/def :HealthcareService/specialty (s/coll-of ::CodeableConcept))
(s/def :HealthcareService/name ::string)
(s/def :HealthcareService/telecom (s/coll-of ::ContactPoint))


;; Patient

(s/def :Patient/deceased ::string)
(s/def :Patient/active ::boolean)
(s/def :Patient/contained (s/coll-of ::Resource))
(s/def :Patient/maritalStatus ::CodeableConcept)
(s/def :Patient/gender ::code)
(s/def :Patient/text ::Narrative)
(s/def :Patient/name (s/coll-of ::HumanName))
(s/def :Patient/telecom (s/coll-of ::ContactPoint))
(s/def :Patient/identifier (s/coll-of ::Identifier))
(s/def :Patient/managingOrganization ::Reference)
(s/def :Patient/photo (s/coll-of ::Attachment))
(s/def :Patient/generalPractitioner (s/coll-of ::Reference))
(s/def :Patient/link (s/coll-of ::string))
(s/def :Patient/animal ::string)
(s/def :Patient/birthDate ::date)
(s/def :Patient/language ::code)
(s/def :Patient/communication (s/coll-of ::string))
(s/def :Patient/id ::id)
(s/def :Patient/multipleBirth ::string)
(s/def :Patient/meta ::Meta)
(s/def :Patient/address (s/coll-of ::Address))
(s/def :Patient/implicitRules ::uri)
(s/def :Patient/contact (s/coll-of ::string))


;; MedicationDispense

(s/def :MedicationDispense/text ::Narrative)
(s/def :MedicationDispense/whenHandedOver ::dateTime)
(s/def :MedicationDispense/contained (s/coll-of ::Resource))
(s/def :MedicationDispense/subject ::Reference)
(s/def :MedicationDispense/category ::CodeableConcept)
(s/def :MedicationDispense/id ::id)
(s/def :MedicationDispense/identifier (s/coll-of ::Identifier))
(s/def :MedicationDispense/supportingInformation (s/coll-of ::Reference))
(s/def :MedicationDispense/detectedIssue (s/coll-of ::Reference))
(s/def :MedicationDispense/receiver (s/coll-of ::Reference))
(s/def :MedicationDispense/destination ::Reference)
(s/def :MedicationDispense/note (s/coll-of ::Annotation))
(s/def :MedicationDispense/daysSupply ::Quantity)
(s/def :MedicationDispense/type ::CodeableConcept)
(s/def :MedicationDispense/notDone ::boolean)
(s/def :MedicationDispense/meta ::Meta)
(s/def :MedicationDispense/medication ::string)
(s/def :MedicationDispense/performer (s/coll-of ::string))
(s/def :MedicationDispense/language ::code)
(s/def :MedicationDispense/partOf (s/coll-of ::Reference))
(s/def :MedicationDispense/status ::code)
(s/def :MedicationDispense/quantity ::Quantity)
(s/def :MedicationDispense/notDoneReason ::string)
(s/def :MedicationDispense/substitution ::string)
(s/def :MedicationDispense/whenPrepared ::dateTime)
(s/def :MedicationDispense/implicitRules ::uri)
(s/def :MedicationDispense/authorizingPrescription (s/coll-of ::Reference))
(s/def :MedicationDispense/dosageInstruction (s/coll-of ::Dosage))
(s/def :MedicationDispense/eventHistory (s/coll-of ::Reference))
(s/def :MedicationDispense/context ::Reference)


;; DeviceUseStatement

(s/def :DeviceUseStatement/timing ::string)
(s/def :DeviceUseStatement/source ::Reference)
(s/def :DeviceUseStatement/id ::id)
(s/def :DeviceUseStatement/meta ::Meta)
(s/def :DeviceUseStatement/status ::code)
(s/def :DeviceUseStatement/note (s/coll-of ::Annotation))
(s/def :DeviceUseStatement/implicitRules ::uri)
(s/def :DeviceUseStatement/subject ::Reference)
(s/def :DeviceUseStatement/identifier (s/coll-of ::Identifier))
(s/def :DeviceUseStatement/device ::Reference)
(s/def :DeviceUseStatement/recordedOn ::dateTime)
(s/def :DeviceUseStatement/bodySite ::CodeableConcept)
(s/def :DeviceUseStatement/language ::code)
(s/def :DeviceUseStatement/indication (s/coll-of ::CodeableConcept))
(s/def :DeviceUseStatement/text ::Narrative)
(s/def :DeviceUseStatement/whenUsed ::Period)
(s/def :DeviceUseStatement/contained (s/coll-of ::Resource))


;; StructureMap

(s/def :StructureMap/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :StructureMap/text ::Narrative)
(s/def :StructureMap/experimental ::boolean)
(s/def :StructureMap/title ::string)
(s/def :StructureMap/meta ::Meta)
(s/def :StructureMap/purpose ::markdown)
(s/def :StructureMap/status ::code)
(s/def :StructureMap/description ::markdown)
(s/def :StructureMap/name ::string)
(s/def :StructureMap/url ::uri)
(s/def :StructureMap/group (s/coll-of ::string))
(s/def :StructureMap/import (s/coll-of ::uri))
(s/def :StructureMap/contact (s/coll-of ::ContactDetail))
(s/def :StructureMap/date ::dateTime)
(s/def :StructureMap/identifier (s/coll-of ::Identifier))
(s/def :StructureMap/structure (s/coll-of ::string))
(s/def :StructureMap/language ::code)
(s/def :StructureMap/contained (s/coll-of ::Resource))
(s/def :StructureMap/copyright ::markdown)
(s/def :StructureMap/version ::string)
(s/def :StructureMap/publisher ::string)
(s/def :StructureMap/implicitRules ::uri)
(s/def :StructureMap/id ::id)
(s/def :StructureMap/useContext (s/coll-of ::UsageContext))


;; Library

(s/def :Library/type ::CodeableConcept)
(s/def :Library/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :Library/identifier (s/coll-of ::Identifier))
(s/def :Library/topic (s/coll-of ::CodeableConcept))
(s/def :Library/purpose ::markdown)
(s/def :Library/status ::code)
(s/def :Library/date ::dateTime)
(s/def :Library/id ::id)
(s/def :Library/description ::markdown)
(s/def :Library/dataRequirement (s/coll-of ::DataRequirement))
(s/def :Library/parameter (s/coll-of ::ParameterDefinition))
(s/def :Library/meta ::Meta)
(s/def :Library/copyright ::markdown)
(s/def :Library/version ::string)
(s/def :Library/publisher ::string)
(s/def :Library/useContext (s/coll-of ::UsageContext))
(s/def :Library/text ::Narrative)
(s/def :Library/lastReviewDate ::date)
(s/def :Library/title ::string)
(s/def :Library/relatedArtifact (s/coll-of ::RelatedArtifact))
(s/def :Library/language ::code)
(s/def :Library/content (s/coll-of ::Attachment))
(s/def :Library/contained (s/coll-of ::Resource))
(s/def :Library/effectivePeriod ::Period)
(s/def :Library/usage ::string)
(s/def :Library/implicitRules ::uri)
(s/def :Library/name ::string)
(s/def :Library/contributor (s/coll-of ::Contributor))
(s/def :Library/experimental ::boolean)
(s/def :Library/url ::uri)
(s/def :Library/approvalDate ::date)
(s/def :Library/contact (s/coll-of ::ContactDetail))


;; Basic

(s/def :Basic/code ::CodeableConcept)
(s/def :Basic/text ::Narrative)
(s/def :Basic/identifier (s/coll-of ::Identifier))
(s/def :Basic/language ::code)
(s/def :Basic/author ::Reference)
(s/def :Basic/implicitRules ::uri)
(s/def :Basic/created ::date)
(s/def :Basic/meta ::Meta)
(s/def :Basic/id ::id)
(s/def :Basic/contained (s/coll-of ::Resource))
(s/def :Basic/subject ::Reference)


;; Slot

(s/def :Slot/text ::Narrative)
(s/def :Slot/overbooked ::boolean)
(s/def :Slot/identifier (s/coll-of ::Identifier))
(s/def :Slot/comment ::string)
(s/def :Slot/status ::code)
(s/def :Slot/appointmentType ::CodeableConcept)
(s/def :Slot/contained (s/coll-of ::Resource))
(s/def :Slot/id ::id)
(s/def :Slot/specialty (s/coll-of ::CodeableConcept))
(s/def :Slot/implicitRules ::uri)
(s/def :Slot/end ::instant)
(s/def :Slot/serviceType (s/coll-of ::CodeableConcept))
(s/def :Slot/meta ::Meta)
(s/def :Slot/schedule ::Reference)
(s/def :Slot/start ::instant)
(s/def :Slot/language ::code)
(s/def :Slot/serviceCategory ::CodeableConcept)


;; ActivityDefinition

(s/def :ActivityDefinition/description ::markdown)
(s/def :ActivityDefinition/location ::Reference)
(s/def :ActivityDefinition/url ::uri)
(s/def :ActivityDefinition/experimental ::boolean)
(s/def :ActivityDefinition/topic (s/coll-of ::CodeableConcept))
(s/def :ActivityDefinition/relatedArtifact (s/coll-of ::RelatedArtifact))
(s/def :ActivityDefinition/timing ::string)
(s/def :ActivityDefinition/product ::string)
(s/def :ActivityDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :ActivityDefinition/kind ::code)
(s/def :ActivityDefinition/useContext (s/coll-of ::UsageContext))
(s/def :ActivityDefinition/identifier (s/coll-of ::Identifier))
(s/def :ActivityDefinition/effectivePeriod ::Period)
(s/def :ActivityDefinition/contributor (s/coll-of ::Contributor))
(s/def :ActivityDefinition/text ::Narrative)
(s/def :ActivityDefinition/implicitRules ::uri)
(s/def :ActivityDefinition/bodySite (s/coll-of ::CodeableConcept))
(s/def :ActivityDefinition/title ::string)
(s/def :ActivityDefinition/name ::string)
(s/def :ActivityDefinition/quantity ::Quantity)
(s/def :ActivityDefinition/dosage (s/coll-of ::Dosage))
(s/def :ActivityDefinition/approvalDate ::date)
(s/def :ActivityDefinition/participant (s/coll-of ::string))
(s/def :ActivityDefinition/code ::CodeableConcept)
(s/def :ActivityDefinition/contained (s/coll-of ::Resource))
(s/def :ActivityDefinition/copyright ::markdown)
(s/def :ActivityDefinition/meta ::Meta)
(s/def :ActivityDefinition/status ::code)
(s/def :ActivityDefinition/language ::code)
(s/def :ActivityDefinition/purpose ::markdown)
(s/def :ActivityDefinition/library (s/coll-of ::Reference))
(s/def :ActivityDefinition/version ::string)
(s/def :ActivityDefinition/transform ::Reference)
(s/def :ActivityDefinition/date ::dateTime)
(s/def :ActivityDefinition/publisher ::string)
(s/def :ActivityDefinition/id ::id)
(s/def :ActivityDefinition/lastReviewDate ::date)
(s/def :ActivityDefinition/dynamicValue (s/coll-of ::string))
(s/def :ActivityDefinition/usage ::string)
(s/def :ActivityDefinition/contact (s/coll-of ::ContactDetail))


;; Specimen

(s/def :Specimen/processing (s/coll-of ::string))
(s/def :Specimen/collection ::string)
(s/def :Specimen/request (s/coll-of ::Reference))
(s/def :Specimen/type ::CodeableConcept)
(s/def :Specimen/parent (s/coll-of ::Reference))
(s/def :Specimen/contained (s/coll-of ::Resource))
(s/def :Specimen/subject ::Reference)
(s/def :Specimen/accessionIdentifier ::Identifier)
(s/def :Specimen/id ::id)
(s/def :Specimen/container (s/coll-of ::string))
(s/def :Specimen/receivedTime ::dateTime)
(s/def :Specimen/identifier (s/coll-of ::Identifier))
(s/def :Specimen/language ::code)
(s/def :Specimen/status ::code)
(s/def :Specimen/text ::Narrative)
(s/def :Specimen/meta ::Meta)
(s/def :Specimen/implicitRules ::uri)
(s/def :Specimen/note (s/coll-of ::Annotation))


;; DiagnosticReport

(s/def :DiagnosticReport/subject ::Reference)
(s/def :DiagnosticReport/conclusion ::string)
(s/def :DiagnosticReport/identifier (s/coll-of ::Identifier))
(s/def :DiagnosticReport/result (s/coll-of ::Reference))
(s/def :DiagnosticReport/codedDiagnosis (s/coll-of ::CodeableConcept))
(s/def :DiagnosticReport/meta ::Meta)
(s/def :DiagnosticReport/contained (s/coll-of ::Resource))
(s/def :DiagnosticReport/basedOn (s/coll-of ::Reference))
(s/def :DiagnosticReport/performer (s/coll-of ::string))
(s/def :DiagnosticReport/image (s/coll-of ::string))
(s/def :DiagnosticReport/implicitRules ::uri)
(s/def :DiagnosticReport/imagingStudy (s/coll-of ::Reference))
(s/def :DiagnosticReport/id ::id)
(s/def :DiagnosticReport/context ::Reference)
(s/def :DiagnosticReport/text ::Narrative)
(s/def :DiagnosticReport/category ::CodeableConcept)
(s/def :DiagnosticReport/code ::CodeableConcept)
(s/def :DiagnosticReport/presentedForm (s/coll-of ::Attachment))
(s/def :DiagnosticReport/language ::code)
(s/def :DiagnosticReport/status ::code)
(s/def :DiagnosticReport/effective ::string)
(s/def :DiagnosticReport/issued ::instant)
(s/def :DiagnosticReport/specimen (s/coll-of ::Reference))


;; Subscription

(s/def :Subscription/channel ::string)
(s/def :Subscription/reason ::string)
(s/def :Subscription/contained (s/coll-of ::Resource))
(s/def :Subscription/meta ::Meta)
(s/def :Subscription/error ::string)
(s/def :Subscription/tag (s/coll-of ::Coding))
(s/def :Subscription/status ::code)
(s/def :Subscription/language ::code)
(s/def :Subscription/criteria ::string)
(s/def :Subscription/implicitRules ::uri)
(s/def :Subscription/id ::id)
(s/def :Subscription/end ::instant)
(s/def :Subscription/contact (s/coll-of ::ContactPoint))
(s/def :Subscription/text ::Narrative)


;; RequestGroup

(s/def :RequestGroup/identifier (s/coll-of ::Identifier))
(s/def :RequestGroup/language ::code)
(s/def :RequestGroup/id ::id)
(s/def :RequestGroup/note (s/coll-of ::Annotation))
(s/def :RequestGroup/meta ::Meta)
(s/def :RequestGroup/status ::code)
(s/def :RequestGroup/reason ::string)
(s/def :RequestGroup/action (s/coll-of ::string))
(s/def :RequestGroup/context ::Reference)
(s/def :RequestGroup/subject ::Reference)
(s/def :RequestGroup/authoredOn ::dateTime)
(s/def :RequestGroup/intent ::code)
(s/def :RequestGroup/priority ::code)
(s/def :RequestGroup/author ::Reference)
(s/def :RequestGroup/definition (s/coll-of ::Reference))
(s/def :RequestGroup/groupIdentifier ::Identifier)
(s/def :RequestGroup/replaces (s/coll-of ::Reference))
(s/def :RequestGroup/implicitRules ::uri)
(s/def :RequestGroup/basedOn (s/coll-of ::Reference))
(s/def :RequestGroup/text ::Narrative)
(s/def :RequestGroup/contained (s/coll-of ::Resource))


;; Provenance

(s/def :Provenance/text ::Narrative)
(s/def :Provenance/language ::code)
(s/def :Provenance/target (s/coll-of ::Reference))
(s/def :Provenance/meta ::Meta)
(s/def :Provenance/id ::id)
(s/def :Provenance/agent (s/coll-of ::string))
(s/def :Provenance/recorded ::instant)
(s/def :Provenance/signature (s/coll-of ::Signature))
(s/def :Provenance/entity (s/coll-of ::string))
(s/def :Provenance/policy (s/coll-of ::uri))
(s/def :Provenance/implicitRules ::uri)
(s/def :Provenance/activity ::Coding)
(s/def :Provenance/contained (s/coll-of ::Resource))
(s/def :Provenance/period ::Period)
(s/def :Provenance/reason (s/coll-of ::Coding))
(s/def :Provenance/location ::Reference)


;; Practitioner

(s/def :Practitioner/identifier (s/coll-of ::Identifier))
(s/def :Practitioner/contained (s/coll-of ::Resource))
(s/def :Practitioner/qualification (s/coll-of ::string))
(s/def :Practitioner/active ::boolean)
(s/def :Practitioner/name (s/coll-of ::HumanName))
(s/def :Practitioner/text ::Narrative)
(s/def :Practitioner/communication (s/coll-of ::CodeableConcept))
(s/def :Practitioner/telecom (s/coll-of ::ContactPoint))
(s/def :Practitioner/birthDate ::date)
(s/def :Practitioner/implicitRules ::uri)
(s/def :Practitioner/id ::id)
(s/def :Practitioner/gender ::code)
(s/def :Practitioner/language ::code)
(s/def :Practitioner/address (s/coll-of ::Address))
(s/def :Practitioner/meta ::Meta)
(s/def :Practitioner/photo (s/coll-of ::Attachment))


;; Flag

(s/def :Flag/contained (s/coll-of ::Resource))
(s/def :Flag/encounter ::Reference)
(s/def :Flag/id ::id)
(s/def :Flag/implicitRules ::uri)
(s/def :Flag/subject ::Reference)
(s/def :Flag/category ::CodeableConcept)
(s/def :Flag/author ::Reference)
(s/def :Flag/status ::code)
(s/def :Flag/code ::CodeableConcept)
(s/def :Flag/period ::Period)
(s/def :Flag/language ::code)
(s/def :Flag/text ::Narrative)
(s/def :Flag/meta ::Meta)
(s/def :Flag/identifier (s/coll-of ::Identifier))


;; ExplanationOfBenefit

(s/def :ExplanationOfBenefit/benefitBalance (s/coll-of ::string))
(s/def :ExplanationOfBenefit/form ::CodeableConcept)
(s/def :ExplanationOfBenefit/payee ::string)
(s/def :ExplanationOfBenefit/diagnosis (s/coll-of ::string))
(s/def :ExplanationOfBenefit/hospitalization ::Period)
(s/def :ExplanationOfBenefit/information (s/coll-of ::string))
(s/def :ExplanationOfBenefit/accident ::string)
(s/def :ExplanationOfBenefit/careTeam (s/coll-of ::string))
(s/def :ExplanationOfBenefit/enterer ::Reference)
(s/def :ExplanationOfBenefit/language ::code)
(s/def :ExplanationOfBenefit/insurer ::Reference)
(s/def :ExplanationOfBenefit/type ::CodeableConcept)
(s/def :ExplanationOfBenefit/facility ::Reference)
(s/def :ExplanationOfBenefit/id ::id)
(s/def :ExplanationOfBenefit/subType (s/coll-of ::CodeableConcept))
(s/def :ExplanationOfBenefit/processNote (s/coll-of ::string))
(s/def :ExplanationOfBenefit/organization ::Reference)
(s/def :ExplanationOfBenefit/implicitRules ::uri)
(s/def :ExplanationOfBenefit/referral ::Reference)
(s/def :ExplanationOfBenefit/precedence ::positiveInt)
(s/def :ExplanationOfBenefit/insurance ::string)
(s/def :ExplanationOfBenefit/payment ::string)
(s/def :ExplanationOfBenefit/originalPrescription ::Reference)
(s/def :ExplanationOfBenefit/related (s/coll-of ::string))
(s/def :ExplanationOfBenefit/unallocDeductable ::Money)
(s/def :ExplanationOfBenefit/outcome ::CodeableConcept)
(s/def :ExplanationOfBenefit/totalBenefit ::Money)
(s/def :ExplanationOfBenefit/text ::Narrative)
(s/def :ExplanationOfBenefit/meta ::Meta)
(s/def :ExplanationOfBenefit/contained (s/coll-of ::Resource))
(s/def :ExplanationOfBenefit/claimResponse ::Reference)
(s/def :ExplanationOfBenefit/totalCost ::Money)
(s/def :ExplanationOfBenefit/procedure (s/coll-of ::string))
(s/def :ExplanationOfBenefit/identifier (s/coll-of ::Identifier))
(s/def :ExplanationOfBenefit/created ::dateTime)
(s/def :ExplanationOfBenefit/prescription ::Reference)
(s/def :ExplanationOfBenefit/addItem (s/coll-of ::string))
(s/def :ExplanationOfBenefit/provider ::Reference)
(s/def :ExplanationOfBenefit/billablePeriod ::Period)
(s/def :ExplanationOfBenefit/status ::code)
(s/def :ExplanationOfBenefit/employmentImpacted ::Period)
(s/def :ExplanationOfBenefit/claim ::Reference)
(s/def :ExplanationOfBenefit/patient ::Reference)
(s/def :ExplanationOfBenefit/disposition ::string)
(s/def :ExplanationOfBenefit/item (s/coll-of ::string))


;; Linkage

(s/def :Linkage/active ::boolean)
(s/def :Linkage/language ::code)
(s/def :Linkage/item (s/coll-of ::string))
(s/def :Linkage/id ::id)
(s/def :Linkage/author ::Reference)
(s/def :Linkage/text ::Narrative)
(s/def :Linkage/contained (s/coll-of ::Resource))
(s/def :Linkage/meta ::Meta)
(s/def :Linkage/implicitRules ::uri)


;; OperationOutcome

(s/def :OperationOutcome/implicitRules ::uri)
(s/def :OperationOutcome/language ::code)
(s/def :OperationOutcome/contained (s/coll-of ::Resource))
(s/def :OperationOutcome/issue (s/coll-of ::string))
(s/def :OperationOutcome/id ::id)
(s/def :OperationOutcome/meta ::Meta)
(s/def :OperationOutcome/text ::Narrative)


;; Immunization

(s/def :Immunization/manufacturer ::Reference)
(s/def :Immunization/location ::Reference)
(s/def :Immunization/practitioner (s/coll-of ::string))
(s/def :Immunization/language ::code)
(s/def :Immunization/reaction (s/coll-of ::string))
(s/def :Immunization/encounter ::Reference)
(s/def :Immunization/text ::Narrative)
(s/def :Immunization/lotNumber ::string)
(s/def :Immunization/contained (s/coll-of ::Resource))
(s/def :Immunization/reportOrigin ::CodeableConcept)
(s/def :Immunization/status ::code)
(s/def :Immunization/patient ::Reference)
(s/def :Immunization/vaccinationProtocol (s/coll-of ::string))
(s/def :Immunization/date ::dateTime)
(s/def :Immunization/explanation ::string)
(s/def :Immunization/implicitRules ::uri)
(s/def :Immunization/expirationDate ::date)
(s/def :Immunization/notGiven ::boolean)
(s/def :Immunization/doseQuantity ::Quantity)
(s/def :Immunization/meta ::Meta)
(s/def :Immunization/site ::CodeableConcept)
(s/def :Immunization/identifier (s/coll-of ::Identifier))
(s/def :Immunization/vaccineCode ::CodeableConcept)
(s/def :Immunization/route ::CodeableConcept)
(s/def :Immunization/id ::id)
(s/def :Immunization/note (s/coll-of ::Annotation))
(s/def :Immunization/primarySource ::boolean)


;; ResearchSubject

(s/def :ResearchSubject/individual ::Reference)
(s/def :ResearchSubject/consent ::Reference)
(s/def :ResearchSubject/language ::code)
(s/def :ResearchSubject/study ::Reference)
(s/def :ResearchSubject/meta ::Meta)
(s/def :ResearchSubject/period ::Period)
(s/def :ResearchSubject/text ::Narrative)
(s/def :ResearchSubject/identifier ::Identifier)
(s/def :ResearchSubject/assignedArm ::string)
(s/def :ResearchSubject/actualArm ::string)
(s/def :ResearchSubject/implicitRules ::uri)
(s/def :ResearchSubject/id ::id)
(s/def :ResearchSubject/contained (s/coll-of ::Resource))
(s/def :ResearchSubject/status ::code)


;; ExpansionProfile

(s/def :ExpansionProfile/activeOnly ::boolean)
(s/def :ExpansionProfile/includeDefinition ::boolean)
(s/def :ExpansionProfile/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :ExpansionProfile/limitedExpansion ::boolean)
(s/def :ExpansionProfile/url ::uri)
(s/def :ExpansionProfile/language ::code)
(s/def :ExpansionProfile/displayLanguage ::code)
(s/def :ExpansionProfile/excludePostCoordinated ::boolean)
(s/def :ExpansionProfile/excludeNested ::boolean)
(s/def :ExpansionProfile/experimental ::boolean)
(s/def :ExpansionProfile/meta ::Meta)
(s/def :ExpansionProfile/contact (s/coll-of ::ContactDetail))
(s/def :ExpansionProfile/designation ::string)
(s/def :ExpansionProfile/identifier ::Identifier)
(s/def :ExpansionProfile/id ::id)
(s/def :ExpansionProfile/name ::string)
(s/def :ExpansionProfile/contained (s/coll-of ::Resource))
(s/def :ExpansionProfile/description ::markdown)
(s/def :ExpansionProfile/fixedVersion (s/coll-of ::string))
(s/def :ExpansionProfile/implicitRules ::uri)
(s/def :ExpansionProfile/status ::code)
(s/def :ExpansionProfile/excludeNotForUI ::boolean)
(s/def :ExpansionProfile/publisher ::string)
(s/def :ExpansionProfile/excludedSystem ::string)
(s/def :ExpansionProfile/version ::string)
(s/def :ExpansionProfile/useContext (s/coll-of ::UsageContext))
(s/def :ExpansionProfile/date ::dateTime)
(s/def :ExpansionProfile/text ::Narrative)
(s/def :ExpansionProfile/includeDesignations ::boolean)


;; EligibilityRequest

(s/def :EligibilityRequest/id ::id)
(s/def :EligibilityRequest/identifier (s/coll-of ::Identifier))
(s/def :EligibilityRequest/text ::Narrative)
(s/def :EligibilityRequest/priority ::CodeableConcept)
(s/def :EligibilityRequest/meta ::Meta)
(s/def :EligibilityRequest/coverage ::Reference)
(s/def :EligibilityRequest/serviced ::string)
(s/def :EligibilityRequest/status ::code)
(s/def :EligibilityRequest/created ::dateTime)
(s/def :EligibilityRequest/provider ::Reference)
(s/def :EligibilityRequest/facility ::Reference)
(s/def :EligibilityRequest/benefitSubCategory ::CodeableConcept)
(s/def :EligibilityRequest/insurer ::Reference)
(s/def :EligibilityRequest/language ::code)
(s/def :EligibilityRequest/patient ::Reference)
(s/def :EligibilityRequest/benefitCategory ::CodeableConcept)
(s/def :EligibilityRequest/businessArrangement ::string)
(s/def :EligibilityRequest/enterer ::Reference)
(s/def :EligibilityRequest/organization ::Reference)
(s/def :EligibilityRequest/implicitRules ::uri)
(s/def :EligibilityRequest/contained (s/coll-of ::Resource))


;; PaymentNotice

(s/def :PaymentNotice/provider ::Reference)
(s/def :PaymentNotice/text ::Narrative)
(s/def :PaymentNotice/organization ::Reference)
(s/def :PaymentNotice/created ::dateTime)
(s/def :PaymentNotice/request ::Reference)
(s/def :PaymentNotice/id ::id)
(s/def :PaymentNotice/status ::code)
(s/def :PaymentNotice/target ::Reference)
(s/def :PaymentNotice/identifier (s/coll-of ::Identifier))
(s/def :PaymentNotice/paymentStatus ::CodeableConcept)
(s/def :PaymentNotice/meta ::Meta)
(s/def :PaymentNotice/implicitRules ::uri)
(s/def :PaymentNotice/language ::code)
(s/def :PaymentNotice/statusDate ::date)
(s/def :PaymentNotice/response ::Reference)
(s/def :PaymentNotice/contained (s/coll-of ::Resource))


;; NamingSystem

(s/def :NamingSystem/language ::code)
(s/def :NamingSystem/date ::dateTime)
(s/def :NamingSystem/type ::CodeableConcept)
(s/def :NamingSystem/kind ::code)
(s/def :NamingSystem/replacedBy ::Reference)
(s/def :NamingSystem/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :NamingSystem/contained (s/coll-of ::Resource))
(s/def :NamingSystem/responsible ::string)
(s/def :NamingSystem/meta ::Meta)
(s/def :NamingSystem/description ::markdown)
(s/def :NamingSystem/contact (s/coll-of ::ContactDetail))
(s/def :NamingSystem/usage ::string)
(s/def :NamingSystem/status ::code)
(s/def :NamingSystem/id ::id)
(s/def :NamingSystem/publisher ::string)
(s/def :NamingSystem/implicitRules ::uri)
(s/def :NamingSystem/name ::string)
(s/def :NamingSystem/uniqueId (s/coll-of ::string))
(s/def :NamingSystem/text ::Narrative)
(s/def :NamingSystem/useContext (s/coll-of ::UsageContext))


;; MedicationStatement

(s/def :MedicationStatement/dosage (s/coll-of ::Dosage))
(s/def :MedicationStatement/dateAsserted ::dateTime)
(s/def :MedicationStatement/identifier (s/coll-of ::Identifier))
(s/def :MedicationStatement/taken ::code)
(s/def :MedicationStatement/category ::CodeableConcept)
(s/def :MedicationStatement/meta ::Meta)
(s/def :MedicationStatement/implicitRules ::uri)
(s/def :MedicationStatement/contained (s/coll-of ::Resource))
(s/def :MedicationStatement/language ::code)
(s/def :MedicationStatement/informationSource ::Reference)
(s/def :MedicationStatement/basedOn (s/coll-of ::Reference))
(s/def :MedicationStatement/subject ::Reference)
(s/def :MedicationStatement/id ::id)
(s/def :MedicationStatement/reasonNotTaken (s/coll-of ::CodeableConcept))
(s/def :MedicationStatement/medication ::string)
(s/def :MedicationStatement/reasonReference (s/coll-of ::Reference))
(s/def :MedicationStatement/context ::Reference)
(s/def :MedicationStatement/status ::code)
(s/def :MedicationStatement/note (s/coll-of ::Annotation))
(s/def :MedicationStatement/effective ::string)
(s/def :MedicationStatement/reasonCode (s/coll-of ::CodeableConcept))
(s/def :MedicationStatement/partOf (s/coll-of ::Reference))
(s/def :MedicationStatement/text ::Narrative)
(s/def :MedicationStatement/derivedFrom (s/coll-of ::Reference))


;; EnrollmentResponse

(s/def :EnrollmentResponse/status ::code)
(s/def :EnrollmentResponse/id ::id)
(s/def :EnrollmentResponse/outcome ::CodeableConcept)
(s/def :EnrollmentResponse/created ::dateTime)
(s/def :EnrollmentResponse/requestProvider ::Reference)
(s/def :EnrollmentResponse/text ::Narrative)
(s/def :EnrollmentResponse/language ::code)
(s/def :EnrollmentResponse/meta ::Meta)
(s/def :EnrollmentResponse/request ::Reference)
(s/def :EnrollmentResponse/contained (s/coll-of ::Resource))
(s/def :EnrollmentResponse/requestOrganization ::Reference)
(s/def :EnrollmentResponse/identifier (s/coll-of ::Identifier))
(s/def :EnrollmentResponse/organization ::Reference)
(s/def :EnrollmentResponse/disposition ::string)
(s/def :EnrollmentResponse/implicitRules ::uri)


;; NutritionOrder

(s/def :NutritionOrder/foodPreferenceModifier (s/coll-of ::CodeableConcept))
(s/def :NutritionOrder/enteralFormula ::string)
(s/def :NutritionOrder/language ::code)
(s/def :NutritionOrder/meta ::Meta)
(s/def :NutritionOrder/dateTime ::dateTime)
(s/def :NutritionOrder/supplement (s/coll-of ::string))
(s/def :NutritionOrder/implicitRules ::uri)
(s/def :NutritionOrder/id ::id)
(s/def :NutritionOrder/identifier (s/coll-of ::Identifier))
(s/def :NutritionOrder/contained (s/coll-of ::Resource))
(s/def :NutritionOrder/allergyIntolerance (s/coll-of ::Reference))
(s/def :NutritionOrder/patient ::Reference)
(s/def :NutritionOrder/text ::Narrative)
(s/def :NutritionOrder/status ::code)
(s/def :NutritionOrder/encounter ::Reference)
(s/def :NutritionOrder/excludeFoodModifier (s/coll-of ::CodeableConcept))
(s/def :NutritionOrder/oralDiet ::string)
(s/def :NutritionOrder/orderer ::Reference)


;; Questionnaire

(s/def :Questionnaire/text ::Narrative)
(s/def :Questionnaire/approvalDate ::date)
(s/def :Questionnaire/code (s/coll-of ::Coding))
(s/def :Questionnaire/copyright ::markdown)
(s/def :Questionnaire/title ::string)
(s/def :Questionnaire/lastReviewDate ::date)
(s/def :Questionnaire/effectivePeriod ::Period)
(s/def :Questionnaire/meta ::Meta)
(s/def :Questionnaire/identifier (s/coll-of ::Identifier))
(s/def :Questionnaire/implicitRules ::uri)
(s/def :Questionnaire/publisher ::string)
(s/def :Questionnaire/purpose ::markdown)
(s/def :Questionnaire/item (s/coll-of ::string))
(s/def :Questionnaire/contained (s/coll-of ::Resource))
(s/def :Questionnaire/description ::markdown)
(s/def :Questionnaire/subjectType (s/coll-of ::code))
(s/def :Questionnaire/language ::code)
(s/def :Questionnaire/experimental ::boolean)
(s/def :Questionnaire/url ::uri)
(s/def :Questionnaire/contact (s/coll-of ::ContactDetail))
(s/def :Questionnaire/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :Questionnaire/date ::dateTime)
(s/def :Questionnaire/status ::code)
(s/def :Questionnaire/name ::string)
(s/def :Questionnaire/useContext (s/coll-of ::UsageContext))
(s/def :Questionnaire/version ::string)
(s/def :Questionnaire/id ::id)


;; Account

(s/def :Account/language ::code)
(s/def :Account/active ::Period)
(s/def :Account/period ::Period)
(s/def :Account/implicitRules ::uri)
(s/def :Account/id ::id)
(s/def :Account/contained (s/coll-of ::Resource))
(s/def :Account/description ::string)
(s/def :Account/name ::string)
(s/def :Account/text ::Narrative)
(s/def :Account/balance ::Money)
(s/def :Account/identifier (s/coll-of ::Identifier))
(s/def :Account/owner ::Reference)
(s/def :Account/guarantor (s/coll-of ::string))
(s/def :Account/subject ::Reference)
(s/def :Account/coverage (s/coll-of ::string))
(s/def :Account/meta ::Meta)
(s/def :Account/type ::CodeableConcept)
(s/def :Account/status ::code)


;; CommunicationRequest

(s/def :CommunicationRequest/recipient (s/coll-of ::Reference))
(s/def :CommunicationRequest/reasonCode (s/coll-of ::CodeableConcept))
(s/def :CommunicationRequest/occurrence ::string)
(s/def :CommunicationRequest/context ::Reference)
(s/def :CommunicationRequest/subject ::Reference)
(s/def :CommunicationRequest/language ::code)
(s/def :CommunicationRequest/category (s/coll-of ::CodeableConcept))
(s/def :CommunicationRequest/topic (s/coll-of ::Reference))
(s/def :CommunicationRequest/medium (s/coll-of ::CodeableConcept))
(s/def :CommunicationRequest/meta ::Meta)
(s/def :CommunicationRequest/basedOn (s/coll-of ::Reference))
(s/def :CommunicationRequest/sender ::Reference)
(s/def :CommunicationRequest/priority ::code)
(s/def :CommunicationRequest/status ::code)
(s/def :CommunicationRequest/contained (s/coll-of ::Resource))
(s/def :CommunicationRequest/implicitRules ::uri)
(s/def :CommunicationRequest/authoredOn ::dateTime)
(s/def :CommunicationRequest/text ::Narrative)
(s/def :CommunicationRequest/id ::id)
(s/def :CommunicationRequest/replaces (s/coll-of ::Reference))
(s/def :CommunicationRequest/requester ::string)
(s/def :CommunicationRequest/payload (s/coll-of ::string))
(s/def :CommunicationRequest/groupIdentifier ::Identifier)
(s/def :CommunicationRequest/note (s/coll-of ::Annotation))
(s/def :CommunicationRequest/identifier (s/coll-of ::Identifier))
(s/def :CommunicationRequest/reasonReference (s/coll-of ::Reference))


;; DocumentManifest

(s/def :DocumentManifest/created ::dateTime)
(s/def :DocumentManifest/recipient (s/coll-of ::Reference))
(s/def :DocumentManifest/identifier (s/coll-of ::Identifier))
(s/def :DocumentManifest/meta ::Meta)
(s/def :DocumentManifest/language ::code)
(s/def :DocumentManifest/subject ::Reference)
(s/def :DocumentManifest/status ::code)
(s/def :DocumentManifest/description ::string)
(s/def :DocumentManifest/implicitRules ::uri)
(s/def :DocumentManifest/text ::Narrative)
(s/def :DocumentManifest/type ::CodeableConcept)
(s/def :DocumentManifest/author (s/coll-of ::Reference))
(s/def :DocumentManifest/related (s/coll-of ::string))
(s/def :DocumentManifest/id ::id)
(s/def :DocumentManifest/source ::uri)
(s/def :DocumentManifest/contained (s/coll-of ::Resource))
(s/def :DocumentManifest/content (s/coll-of ::string))
(s/def :DocumentManifest/masterIdentifier ::Identifier)


;; EligibilityResponse

(s/def :EligibilityResponse/inforce ::boolean)
(s/def :EligibilityResponse/requestOrganization ::Reference)
(s/def :EligibilityResponse/contained (s/coll-of ::Resource))
(s/def :EligibilityResponse/insurance (s/coll-of ::string))
(s/def :EligibilityResponse/insurer ::Reference)
(s/def :EligibilityResponse/error (s/coll-of ::string))
(s/def :EligibilityResponse/meta ::Meta)
(s/def :EligibilityResponse/language ::code)
(s/def :EligibilityResponse/implicitRules ::uri)
(s/def :EligibilityResponse/requestProvider ::Reference)
(s/def :EligibilityResponse/created ::dateTime)
(s/def :EligibilityResponse/id ::id)
(s/def :EligibilityResponse/identifier (s/coll-of ::Identifier))
(s/def :EligibilityResponse/form ::CodeableConcept)
(s/def :EligibilityResponse/disposition ::string)
(s/def :EligibilityResponse/request ::Reference)
(s/def :EligibilityResponse/status ::code)
(s/def :EligibilityResponse/text ::Narrative)
(s/def :EligibilityResponse/outcome ::CodeableConcept)


;; Task

(s/def :Task/owner ::Reference)
(s/def :Task/intent ::code)
(s/def :Task/language ::code)
(s/def :Task/code ::CodeableConcept)
(s/def :Task/restriction ::string)
(s/def :Task/lastModified ::dateTime)
(s/def :Task/description ::string)
(s/def :Task/basedOn (s/coll-of ::Reference))
(s/def :Task/input (s/coll-of ::string))
(s/def :Task/id ::id)
(s/def :Task/reason ::CodeableConcept)
(s/def :Task/implicitRules ::uri)
(s/def :Task/definition ::string)
(s/def :Task/performerType (s/coll-of ::CodeableConcept))
(s/def :Task/priority ::code)
(s/def :Task/authoredOn ::dateTime)
(s/def :Task/output (s/coll-of ::string))
(s/def :Task/context ::Reference)
(s/def :Task/businessStatus ::CodeableConcept)
(s/def :Task/partOf (s/coll-of ::Reference))
(s/def :Task/for ::Reference)
(s/def :Task/identifier (s/coll-of ::Identifier))
(s/def :Task/relevantHistory (s/coll-of ::Reference))
(s/def :Task/executionPeriod ::Period)
(s/def :Task/focus ::Reference)
(s/def :Task/contained (s/coll-of ::Resource))
(s/def :Task/groupIdentifier ::Identifier)
(s/def :Task/statusReason ::CodeableConcept)
(s/def :Task/requester ::string)
(s/def :Task/meta ::Meta)
(s/def :Task/text ::Narrative)
(s/def :Task/note (s/coll-of ::Annotation))
(s/def :Task/status ::code)


;; ValueSet

(s/def :ValueSet/copyright ::markdown)
(s/def :ValueSet/text ::Narrative)
(s/def :ValueSet/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :ValueSet/url ::uri)
(s/def :ValueSet/contained (s/coll-of ::Resource))
(s/def :ValueSet/purpose ::markdown)
(s/def :ValueSet/meta ::Meta)
(s/def :ValueSet/name ::string)
(s/def :ValueSet/date ::dateTime)
(s/def :ValueSet/immutable ::boolean)
(s/def :ValueSet/experimental ::boolean)
(s/def :ValueSet/id ::id)
(s/def :ValueSet/description ::markdown)
(s/def :ValueSet/compose ::string)
(s/def :ValueSet/extensible ::boolean)
(s/def :ValueSet/contact (s/coll-of ::ContactDetail))
(s/def :ValueSet/language ::code)
(s/def :ValueSet/publisher ::string)
(s/def :ValueSet/title ::string)
(s/def :ValueSet/status ::code)
(s/def :ValueSet/identifier (s/coll-of ::Identifier))
(s/def :ValueSet/implicitRules ::uri)
(s/def :ValueSet/useContext (s/coll-of ::UsageContext))
(s/def :ValueSet/version ::string)
(s/def :ValueSet/expansion ::string)


;; Claim

(s/def :Claim/prescription ::Reference)
(s/def :Claim/fundsReserve ::CodeableConcept)
(s/def :Claim/meta ::Meta)
(s/def :Claim/priority ::CodeableConcept)
(s/def :Claim/status ::code)
(s/def :Claim/language ::code)
(s/def :Claim/use ::code)
(s/def :Claim/enterer ::Reference)
(s/def :Claim/subType (s/coll-of ::CodeableConcept))
(s/def :Claim/implicitRules ::uri)
(s/def :Claim/payee ::string)
(s/def :Claim/diagnosis (s/coll-of ::string))
(s/def :Claim/referral ::Reference)
(s/def :Claim/id ::id)
(s/def :Claim/information (s/coll-of ::string))
(s/def :Claim/identifier (s/coll-of ::Identifier))
(s/def :Claim/organization ::Reference)
(s/def :Claim/created ::dateTime)
(s/def :Claim/type ::CodeableConcept)
(s/def :Claim/accident ::string)
(s/def :Claim/procedure (s/coll-of ::string))
(s/def :Claim/item (s/coll-of ::string))
(s/def :Claim/contained (s/coll-of ::Resource))
(s/def :Claim/insurance (s/coll-of ::string))
(s/def :Claim/hospitalization ::Period)
(s/def :Claim/facility ::Reference)
(s/def :Claim/insurer ::Reference)
(s/def :Claim/patient ::Reference)
(s/def :Claim/careTeam (s/coll-of ::string))
(s/def :Claim/text ::Narrative)
(s/def :Claim/provider ::Reference)
(s/def :Claim/total ::Money)
(s/def :Claim/originalPrescription ::Reference)
(s/def :Claim/employmentImpacted ::Period)
(s/def :Claim/related (s/coll-of ::string))
(s/def :Claim/billablePeriod ::Period)


;; ResearchStudy

(s/def :ResearchStudy/period ::Period)
(s/def :ResearchStudy/category (s/coll-of ::CodeableConcept))
(s/def :ResearchStudy/arm (s/coll-of ::string))
(s/def :ResearchStudy/relatedArtifact (s/coll-of ::RelatedArtifact))
(s/def :ResearchStudy/contact (s/coll-of ::ContactDetail))
(s/def :ResearchStudy/focus (s/coll-of ::CodeableConcept))
(s/def :ResearchStudy/meta ::Meta)
(s/def :ResearchStudy/contained (s/coll-of ::Resource))
(s/def :ResearchStudy/implicitRules ::uri)
(s/def :ResearchStudy/sponsor ::Reference)
(s/def :ResearchStudy/principalInvestigator ::Reference)
(s/def :ResearchStudy/identifier (s/coll-of ::Identifier))
(s/def :ResearchStudy/keyword (s/coll-of ::CodeableConcept))
(s/def :ResearchStudy/description ::markdown)
(s/def :ResearchStudy/language ::code)
(s/def :ResearchStudy/title ::string)
(s/def :ResearchStudy/note (s/coll-of ::Annotation))
(s/def :ResearchStudy/protocol (s/coll-of ::Reference))
(s/def :ResearchStudy/id ::id)
(s/def :ResearchStudy/status ::code)
(s/def :ResearchStudy/site (s/coll-of ::Reference))
(s/def :ResearchStudy/reasonStopped ::CodeableConcept)
(s/def :ResearchStudy/partOf (s/coll-of ::Reference))
(s/def :ResearchStudy/enrollment (s/coll-of ::Reference))
(s/def :ResearchStudy/text ::Narrative)
(s/def :ResearchStudy/jurisdiction (s/coll-of ::CodeableConcept))


;; MedicationRequest

(s/def :MedicationRequest/priorPrescription ::Reference)
(s/def :MedicationRequest/priority ::code)
(s/def :MedicationRequest/substitution ::string)
(s/def :MedicationRequest/text ::Narrative)
(s/def :MedicationRequest/medication ::string)
(s/def :MedicationRequest/identifier (s/coll-of ::Identifier))
(s/def :MedicationRequest/context ::Reference)
(s/def :MedicationRequest/requester ::string)
(s/def :MedicationRequest/category ::CodeableConcept)
(s/def :MedicationRequest/recorder ::Reference)
(s/def :MedicationRequest/groupIdentifier ::Identifier)
(s/def :MedicationRequest/note (s/coll-of ::Annotation))
(s/def :MedicationRequest/supportingInformation (s/coll-of ::Reference))
(s/def :MedicationRequest/definition (s/coll-of ::Reference))
(s/def :MedicationRequest/dispenseRequest ::string)
(s/def :MedicationRequest/implicitRules ::uri)
(s/def :MedicationRequest/dosageInstruction (s/coll-of ::Dosage))
(s/def :MedicationRequest/reasonReference (s/coll-of ::Reference))
(s/def :MedicationRequest/status ::code)
(s/def :MedicationRequest/authoredOn ::dateTime)
(s/def :MedicationRequest/basedOn (s/coll-of ::Reference))
(s/def :MedicationRequest/detectedIssue (s/coll-of ::Reference))
(s/def :MedicationRequest/eventHistory (s/coll-of ::Reference))
(s/def :MedicationRequest/reasonCode (s/coll-of ::CodeableConcept))
(s/def :MedicationRequest/id ::id)
(s/def :MedicationRequest/subject ::Reference)
(s/def :MedicationRequest/contained (s/coll-of ::Resource))
(s/def :MedicationRequest/language ::code)
(s/def :MedicationRequest/intent ::code)
(s/def :MedicationRequest/meta ::Meta)


;; Measure

(s/def :Measure/status ::code)
(s/def :Measure/effectivePeriod ::Period)
(s/def :Measure/scoring ::CodeableConcept)
(s/def :Measure/publisher ::string)
(s/def :Measure/title ::string)
(s/def :Measure/useContext (s/coll-of ::UsageContext))
(s/def :Measure/implicitRules ::uri)
(s/def :Measure/meta ::Meta)
(s/def :Measure/type (s/coll-of ::CodeableConcept))
(s/def :Measure/set ::string)
(s/def :Measure/disclaimer ::markdown)
(s/def :Measure/name ::string)
(s/def :Measure/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :Measure/lastReviewDate ::date)
(s/def :Measure/riskAdjustment ::string)
(s/def :Measure/contained (s/coll-of ::Resource))
(s/def :Measure/contributor (s/coll-of ::Contributor))
(s/def :Measure/definition (s/coll-of ::markdown))
(s/def :Measure/contact (s/coll-of ::ContactDetail))
(s/def :Measure/compositeScoring ::CodeableConcept)
(s/def :Measure/library (s/coll-of ::Reference))
(s/def :Measure/text ::Narrative)
(s/def :Measure/version ::string)
(s/def :Measure/date ::dateTime)
(s/def :Measure/url ::uri)
(s/def :Measure/rateAggregation ::string)
(s/def :Measure/improvementNotation ::string)
(s/def :Measure/experimental ::boolean)
(s/def :Measure/relatedArtifact (s/coll-of ::RelatedArtifact))
(s/def :Measure/clinicalRecommendationStatement ::markdown)
(s/def :Measure/group (s/coll-of ::string))
(s/def :Measure/usage ::string)
(s/def :Measure/approvalDate ::date)
(s/def :Measure/description ::markdown)
(s/def :Measure/guidance ::markdown)
(s/def :Measure/copyright ::markdown)
(s/def :Measure/language ::code)
(s/def :Measure/topic (s/coll-of ::CodeableConcept))
(s/def :Measure/id ::id)
(s/def :Measure/identifier (s/coll-of ::Identifier))
(s/def :Measure/supplementalData (s/coll-of ::string))
(s/def :Measure/purpose ::markdown)
(s/def :Measure/rationale ::markdown)


;; List

(s/def :List/contained (s/coll-of ::Resource))
(s/def :List/implicitRules ::uri)
(s/def :List/mode ::code)
(s/def :List/meta ::Meta)
(s/def :List/title ::string)
(s/def :List/id ::id)
(s/def :List/orderedBy ::CodeableConcept)
(s/def :List/date ::dateTime)
(s/def :List/source ::Reference)
(s/def :List/note (s/coll-of ::Annotation))
(s/def :List/text ::Narrative)
(s/def :List/language ::code)
(s/def :List/encounter ::Reference)
(s/def :List/status ::code)
(s/def :List/code ::CodeableConcept)
(s/def :List/subject ::Reference)
(s/def :List/identifier (s/coll-of ::Identifier))
(s/def :List/entry (s/coll-of ::string))
(s/def :List/emptyReason ::CodeableConcept)


;; ServiceDefinition

(s/def :ServiceDefinition/topic (s/coll-of ::CodeableConcept))
(s/def :ServiceDefinition/implicitRules ::uri)
(s/def :ServiceDefinition/status ::code)
(s/def :ServiceDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :ServiceDefinition/effectivePeriod ::Period)
(s/def :ServiceDefinition/version ::string)
(s/def :ServiceDefinition/contributor (s/coll-of ::Contributor))
(s/def :ServiceDefinition/useContext (s/coll-of ::UsageContext))
(s/def :ServiceDefinition/trigger (s/coll-of ::TriggerDefinition))
(s/def :ServiceDefinition/contained (s/coll-of ::Resource))
(s/def :ServiceDefinition/title ::string)
(s/def :ServiceDefinition/description ::markdown)
(s/def :ServiceDefinition/name ::string)
(s/def :ServiceDefinition/approvalDate ::date)
(s/def :ServiceDefinition/relatedArtifact (s/coll-of ::RelatedArtifact))
(s/def :ServiceDefinition/date ::dateTime)
(s/def :ServiceDefinition/contact (s/coll-of ::ContactDetail))
(s/def :ServiceDefinition/text ::Narrative)
(s/def :ServiceDefinition/purpose ::markdown)
(s/def :ServiceDefinition/experimental ::boolean)
(s/def :ServiceDefinition/usage ::string)
(s/def :ServiceDefinition/lastReviewDate ::date)
(s/def :ServiceDefinition/language ::code)
(s/def :ServiceDefinition/publisher ::string)
(s/def :ServiceDefinition/copyright ::markdown)
(s/def :ServiceDefinition/meta ::Meta)
(s/def :ServiceDefinition/operationDefinition ::Reference)
(s/def :ServiceDefinition/id ::id)
(s/def :ServiceDefinition/dataRequirement (s/coll-of ::DataRequirement))
(s/def :ServiceDefinition/identifier (s/coll-of ::Identifier))
(s/def :ServiceDefinition/url ::uri)


;; Encounter

(s/def :Encounter/contained (s/coll-of ::Resource))
(s/def :Encounter/length ::Duration)
(s/def :Encounter/incomingReferral (s/coll-of ::Reference))
(s/def :Encounter/period ::Period)
(s/def :Encounter/participant (s/coll-of ::string))
(s/def :Encounter/episodeOfCare (s/coll-of ::Reference))
(s/def :Encounter/status ::code)
(s/def :Encounter/language ::code)
(s/def :Encounter/reason (s/coll-of ::CodeableConcept))
(s/def :Encounter/identifier (s/coll-of ::Identifier))
(s/def :Encounter/hospitalization ::string)
(s/def :Encounter/location (s/coll-of ::string))
(s/def :Encounter/statusHistory (s/coll-of ::string))
(s/def :Encounter/class ::Coding)
(s/def :Encounter/serviceProvider ::Reference)
(s/def :Encounter/text ::Narrative)
(s/def :Encounter/partOf ::Reference)
(s/def :Encounter/account (s/coll-of ::Reference))
(s/def :Encounter/subject ::Reference)
(s/def :Encounter/implicitRules ::uri)
(s/def :Encounter/diagnosis (s/coll-of ::string))
(s/def :Encounter/id ::id)
(s/def :Encounter/meta ::Meta)
(s/def :Encounter/classHistory (s/coll-of ::string))
(s/def :Encounter/appointment ::Reference)
(s/def :Encounter/priority ::CodeableConcept)
(s/def :Encounter/type (s/coll-of ::CodeableConcept))


;; CapabilityStatement

(s/def :CapabilityStatement/kind ::code)
(s/def :CapabilityStatement/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :CapabilityStatement/copyright ::markdown)
(s/def :CapabilityStatement/experimental ::boolean)
(s/def :CapabilityStatement/implementationGuide (s/coll-of ::uri))
(s/def :CapabilityStatement/profile (s/coll-of ::Reference))
(s/def :CapabilityStatement/description ::markdown)
(s/def :CapabilityStatement/useContext (s/coll-of ::UsageContext))
(s/def :CapabilityStatement/patchFormat (s/coll-of ::code))
(s/def :CapabilityStatement/instantiates (s/coll-of ::uri))
(s/def :CapabilityStatement/version ::string)
(s/def :CapabilityStatement/acceptUnknown ::code)
(s/def :CapabilityStatement/id ::id)
(s/def :CapabilityStatement/format (s/coll-of ::code))
(s/def :CapabilityStatement/date ::dateTime)
(s/def :CapabilityStatement/title ::string)
(s/def :CapabilityStatement/language ::code)
(s/def :CapabilityStatement/meta ::Meta)
(s/def :CapabilityStatement/fhirVersion ::id)
(s/def :CapabilityStatement/software ::string)
(s/def :CapabilityStatement/implicitRules ::uri)
(s/def :CapabilityStatement/implementation ::string)
(s/def :CapabilityStatement/text ::Narrative)
(s/def :CapabilityStatement/purpose ::markdown)
(s/def :CapabilityStatement/url ::uri)
(s/def :CapabilityStatement/messaging (s/coll-of ::string))
(s/def :CapabilityStatement/name ::string)
(s/def :CapabilityStatement/contained (s/coll-of ::Resource))
(s/def :CapabilityStatement/status ::code)
(s/def :CapabilityStatement/contact (s/coll-of ::ContactDetail))
(s/def :CapabilityStatement/rest (s/coll-of ::string))
(s/def :CapabilityStatement/document (s/coll-of ::string))
(s/def :CapabilityStatement/publisher ::string)


;; VisionPrescription

(s/def :VisionPrescription/reason ::string)
(s/def :VisionPrescription/implicitRules ::uri)
(s/def :VisionPrescription/id ::id)
(s/def :VisionPrescription/meta ::Meta)
(s/def :VisionPrescription/text ::Narrative)
(s/def :VisionPrescription/dispense (s/coll-of ::string))
(s/def :VisionPrescription/language ::code)
(s/def :VisionPrescription/patient ::Reference)
(s/def :VisionPrescription/dateWritten ::dateTime)
(s/def :VisionPrescription/status ::code)
(s/def :VisionPrescription/prescriber ::Reference)
(s/def :VisionPrescription/contained (s/coll-of ::Resource))
(s/def :VisionPrescription/identifier (s/coll-of ::Identifier))
(s/def :VisionPrescription/encounter ::Reference)


;; RiskAssessment

(s/def :RiskAssessment/comment ::string)
(s/def :RiskAssessment/condition ::Reference)
(s/def :RiskAssessment/identifier ::Identifier)
(s/def :RiskAssessment/subject ::Reference)
(s/def :RiskAssessment/prediction (s/coll-of ::string))
(s/def :RiskAssessment/status ::code)
(s/def :RiskAssessment/basedOn ::Reference)
(s/def :RiskAssessment/basis (s/coll-of ::Reference))
(s/def :RiskAssessment/language ::code)
(s/def :RiskAssessment/context ::Reference)
(s/def :RiskAssessment/mitigation ::string)
(s/def :RiskAssessment/performer ::Reference)
(s/def :RiskAssessment/text ::Narrative)
(s/def :RiskAssessment/method ::CodeableConcept)
(s/def :RiskAssessment/contained (s/coll-of ::Resource))
(s/def :RiskAssessment/code ::CodeableConcept)
(s/def :RiskAssessment/occurrence ::string)
(s/def :RiskAssessment/id ::id)
(s/def :RiskAssessment/parent ::Reference)
(s/def :RiskAssessment/meta ::Meta)
(s/def :RiskAssessment/implicitRules ::uri)
(s/def :RiskAssessment/reason ::string)


;; BodySite

(s/def :BodySite/image (s/coll-of ::Attachment))
(s/def :BodySite/id ::id)
(s/def :BodySite/active ::boolean)
(s/def :BodySite/meta ::Meta)
(s/def :BodySite/language ::code)
(s/def :BodySite/contained (s/coll-of ::Resource))
(s/def :BodySite/code ::CodeableConcept)
(s/def :BodySite/identifier (s/coll-of ::Identifier))
(s/def :BodySite/qualifier (s/coll-of ::CodeableConcept))
(s/def :BodySite/description ::string)
(s/def :BodySite/text ::Narrative)
(s/def :BodySite/patient ::Reference)
(s/def :BodySite/implicitRules ::uri)


;; ImmunizationRecommendation

(s/def :ImmunizationRecommendation/identifier (s/coll-of ::Identifier))
(s/def :ImmunizationRecommendation/meta ::Meta)
(s/def :ImmunizationRecommendation/recommendation (s/coll-of ::string))
(s/def :ImmunizationRecommendation/contained (s/coll-of ::Resource))
(s/def :ImmunizationRecommendation/id ::id)
(s/def :ImmunizationRecommendation/text ::Narrative)
(s/def :ImmunizationRecommendation/patient ::Reference)
(s/def :ImmunizationRecommendation/language ::code)
(s/def :ImmunizationRecommendation/implicitRules ::uri)


;; ProcessRequest

(s/def :ProcessRequest/include (s/coll-of ::string))
(s/def :ProcessRequest/item (s/coll-of ::string))
(s/def :ProcessRequest/action ::code)
(s/def :ProcessRequest/identifier (s/coll-of ::Identifier))
(s/def :ProcessRequest/language ::code)
(s/def :ProcessRequest/exclude (s/coll-of ::string))
(s/def :ProcessRequest/period ::Period)
(s/def :ProcessRequest/response ::Reference)
(s/def :ProcessRequest/created ::dateTime)
(s/def :ProcessRequest/implicitRules ::uri)
(s/def :ProcessRequest/reference ::string)
(s/def :ProcessRequest/meta ::Meta)
(s/def :ProcessRequest/provider ::Reference)
(s/def :ProcessRequest/request ::Reference)
(s/def :ProcessRequest/status ::code)
(s/def :ProcessRequest/target ::Reference)
(s/def :ProcessRequest/contained (s/coll-of ::Resource))
(s/def :ProcessRequest/nullify ::boolean)
(s/def :ProcessRequest/text ::Narrative)
(s/def :ProcessRequest/organization ::Reference)
(s/def :ProcessRequest/id ::id)


;; RelatedPerson

(s/def :RelatedPerson/name (s/coll-of ::HumanName))
(s/def :RelatedPerson/address (s/coll-of ::Address))
(s/def :RelatedPerson/birthDate ::date)
(s/def :RelatedPerson/contained (s/coll-of ::Resource))
(s/def :RelatedPerson/period ::Period)
(s/def :RelatedPerson/photo (s/coll-of ::Attachment))
(s/def :RelatedPerson/id ::id)
(s/def :RelatedPerson/meta ::Meta)
(s/def :RelatedPerson/identifier (s/coll-of ::Identifier))
(s/def :RelatedPerson/active ::boolean)
(s/def :RelatedPerson/relationship ::CodeableConcept)
(s/def :RelatedPerson/gender ::code)
(s/def :RelatedPerson/implicitRules ::uri)
(s/def :RelatedPerson/telecom (s/coll-of ::ContactPoint))
(s/def :RelatedPerson/language ::code)
(s/def :RelatedPerson/text ::Narrative)
(s/def :RelatedPerson/patient ::Reference)


;; Medication

(s/def :Medication/code ::CodeableConcept)
(s/def :Medication/meta ::Meta)
(s/def :Medication/contained (s/coll-of ::Resource))
(s/def :Medication/text ::Narrative)
(s/def :Medication/id ::id)
(s/def :Medication/isBrand ::boolean)
(s/def :Medication/image (s/coll-of ::Attachment))
(s/def :Medication/isOverTheCounter ::boolean)
(s/def :Medication/ingredient (s/coll-of ::string))
(s/def :Medication/package ::string)
(s/def :Medication/status ::code)
(s/def :Medication/implicitRules ::uri)
(s/def :Medication/language ::code)
(s/def :Medication/form ::CodeableConcept)
(s/def :Medication/manufacturer ::Reference)


;; AppointmentResponse

(s/def :AppointmentResponse/language ::code)
(s/def :AppointmentResponse/text ::Narrative)
(s/def :AppointmentResponse/end ::instant)
(s/def :AppointmentResponse/identifier (s/coll-of ::Identifier))
(s/def :AppointmentResponse/appointment ::Reference)
(s/def :AppointmentResponse/meta ::Meta)
(s/def :AppointmentResponse/id ::id)
(s/def :AppointmentResponse/participantType (s/coll-of ::CodeableConcept))
(s/def :AppointmentResponse/comment ::string)
(s/def :AppointmentResponse/participantStatus ::code)
(s/def :AppointmentResponse/implicitRules ::uri)
(s/def :AppointmentResponse/actor ::Reference)
(s/def :AppointmentResponse/contained (s/coll-of ::Resource))
(s/def :AppointmentResponse/start ::instant)


;; Substance

(s/def :Substance/code ::CodeableConcept)
(s/def :Substance/meta ::Meta)
(s/def :Substance/text ::Narrative)
(s/def :Substance/identifier (s/coll-of ::Identifier))
(s/def :Substance/instance (s/coll-of ::string))
(s/def :Substance/implicitRules ::uri)
(s/def :Substance/contained (s/coll-of ::Resource))
(s/def :Substance/category (s/coll-of ::CodeableConcept))
(s/def :Substance/description ::string)
(s/def :Substance/status ::code)
(s/def :Substance/language ::code)
(s/def :Substance/id ::id)
(s/def :Substance/ingredient (s/coll-of ::string))


;; PaymentReconciliation

(s/def :PaymentReconciliation/status ::code)
(s/def :PaymentReconciliation/disposition ::string)
(s/def :PaymentReconciliation/id ::id)
(s/def :PaymentReconciliation/requestOrganization ::Reference)
(s/def :PaymentReconciliation/contained (s/coll-of ::Resource))
(s/def :PaymentReconciliation/request ::Reference)
(s/def :PaymentReconciliation/total ::Money)
(s/def :PaymentReconciliation/period ::Period)
(s/def :PaymentReconciliation/identifier (s/coll-of ::Identifier))
(s/def :PaymentReconciliation/outcome ::CodeableConcept)
(s/def :PaymentReconciliation/form ::CodeableConcept)
(s/def :PaymentReconciliation/organization ::Reference)
(s/def :PaymentReconciliation/meta ::Meta)
(s/def :PaymentReconciliation/processNote (s/coll-of ::string))
(s/def :PaymentReconciliation/requestProvider ::Reference)
(s/def :PaymentReconciliation/text ::Narrative)
(s/def :PaymentReconciliation/implicitRules ::uri)
(s/def :PaymentReconciliation/detail (s/coll-of ::string))
(s/def :PaymentReconciliation/language ::code)
(s/def :PaymentReconciliation/created ::dateTime)


;; ConceptMap

(s/def :ConceptMap/language ::code)
(s/def :ConceptMap/id ::id)
(s/def :ConceptMap/title ::string)
(s/def :ConceptMap/meta ::Meta)
(s/def :ConceptMap/group (s/coll-of ::string))
(s/def :ConceptMap/purpose ::markdown)
(s/def :ConceptMap/date ::dateTime)
(s/def :ConceptMap/target ::string)
(s/def :ConceptMap/status ::code)
(s/def :ConceptMap/contact (s/coll-of ::ContactDetail))
(s/def :ConceptMap/copyright ::markdown)
(s/def :ConceptMap/name ::string)
(s/def :ConceptMap/source ::string)
(s/def :ConceptMap/experimental ::boolean)
(s/def :ConceptMap/contained (s/coll-of ::Resource))
(s/def :ConceptMap/url ::uri)
(s/def :ConceptMap/version ::string)
(s/def :ConceptMap/identifier ::Identifier)
(s/def :ConceptMap/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :ConceptMap/text ::Narrative)
(s/def :ConceptMap/description ::markdown)
(s/def :ConceptMap/useContext (s/coll-of ::UsageContext))
(s/def :ConceptMap/implicitRules ::uri)
(s/def :ConceptMap/publisher ::string)


;; Person

(s/def :Person/link (s/coll-of ::string))
(s/def :Person/language ::code)
(s/def :Person/telecom (s/coll-of ::ContactPoint))
(s/def :Person/identifier (s/coll-of ::Identifier))
(s/def :Person/name (s/coll-of ::HumanName))
(s/def :Person/managingOrganization ::Reference)
(s/def :Person/active ::boolean)
(s/def :Person/gender ::code)
(s/def :Person/contained (s/coll-of ::Resource))
(s/def :Person/photo ::Attachment)
(s/def :Person/birthDate ::date)
(s/def :Person/meta ::Meta)
(s/def :Person/address (s/coll-of ::Address))
(s/def :Person/id ::id)
(s/def :Person/implicitRules ::uri)
(s/def :Person/text ::Narrative)


;; Condition

(s/def :Condition/identifier (s/coll-of ::Identifier))
(s/def :Condition/category (s/coll-of ::CodeableConcept))
(s/def :Condition/verificationStatus ::code)
(s/def :Condition/stage ::string)
(s/def :Condition/language ::code)
(s/def :Condition/asserter ::Reference)
(s/def :Condition/context ::Reference)
(s/def :Condition/clinicalStatus ::code)
(s/def :Condition/assertedDate ::dateTime)
(s/def :Condition/evidence (s/coll-of ::string))
(s/def :Condition/abatement ::string)
(s/def :Condition/code ::CodeableConcept)
(s/def :Condition/onset ::string)
(s/def :Condition/bodySite (s/coll-of ::CodeableConcept))
(s/def :Condition/severity ::CodeableConcept)
(s/def :Condition/meta ::Meta)
(s/def :Condition/contained (s/coll-of ::Resource))
(s/def :Condition/id ::id)
(s/def :Condition/text ::Narrative)
(s/def :Condition/note (s/coll-of ::Annotation))
(s/def :Condition/subject ::Reference)
(s/def :Condition/implicitRules ::uri)


;; CareTeam

(s/def :CareTeam/context ::Reference)
(s/def :CareTeam/language ::code)
(s/def :CareTeam/managingOrganization (s/coll-of ::Reference))
(s/def :CareTeam/name ::string)
(s/def :CareTeam/status ::code)
(s/def :CareTeam/note (s/coll-of ::Annotation))
(s/def :CareTeam/id ::id)
(s/def :CareTeam/participant (s/coll-of ::string))
(s/def :CareTeam/category (s/coll-of ::CodeableConcept))
(s/def :CareTeam/contained (s/coll-of ::Resource))
(s/def :CareTeam/period ::Period)
(s/def :CareTeam/reasonReference (s/coll-of ::Reference))
(s/def :CareTeam/text ::Narrative)
(s/def :CareTeam/subject ::Reference)
(s/def :CareTeam/reasonCode (s/coll-of ::CodeableConcept))
(s/def :CareTeam/implicitRules ::uri)
(s/def :CareTeam/meta ::Meta)
(s/def :CareTeam/identifier (s/coll-of ::Identifier))


;; StructureDefinition

(s/def :StructureDefinition/url ::uri)
(s/def :StructureDefinition/date ::dateTime)
(s/def :StructureDefinition/description ::markdown)
(s/def :StructureDefinition/snapshot ::string)
(s/def :StructureDefinition/keyword (s/coll-of ::Coding))
(s/def :StructureDefinition/contextInvariant (s/coll-of ::string))
(s/def :StructureDefinition/useContext (s/coll-of ::UsageContext))
(s/def :StructureDefinition/copyright ::markdown)
(s/def :StructureDefinition/differential ::string)
(s/def :StructureDefinition/context (s/coll-of ::string))
(s/def :StructureDefinition/baseDefinition ::uri)
(s/def :StructureDefinition/identifier (s/coll-of ::Identifier))
(s/def :StructureDefinition/mapping (s/coll-of ::string))
(s/def :StructureDefinition/status ::code)
(s/def :StructureDefinition/contextType ::code)
(s/def :StructureDefinition/title ::string)
(s/def :StructureDefinition/version ::string)
(s/def :StructureDefinition/kind ::code)
(s/def :StructureDefinition/meta ::Meta)
(s/def :StructureDefinition/purpose ::markdown)
(s/def :StructureDefinition/abstract ::boolean)
(s/def :StructureDefinition/implicitRules ::uri)
(s/def :StructureDefinition/contact (s/coll-of ::ContactDetail))
(s/def :StructureDefinition/language ::code)
(s/def :StructureDefinition/experimental ::boolean)
(s/def :StructureDefinition/derivation ::code)
(s/def :StructureDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :StructureDefinition/contained (s/coll-of ::Resource))
(s/def :StructureDefinition/name ::string)
(s/def :StructureDefinition/publisher ::string)
(s/def :StructureDefinition/text ::Narrative)
(s/def :StructureDefinition/fhirVersion ::id)
(s/def :StructureDefinition/type ::code)
(s/def :StructureDefinition/id ::id)


;; Procedure

(s/def :Procedure/id ::id)
(s/def :Procedure/contained (s/coll-of ::Resource))
(s/def :Procedure/performed ::string)
(s/def :Procedure/notDoneReason ::CodeableConcept)
(s/def :Procedure/notDone ::boolean)
(s/def :Procedure/focalDevice (s/coll-of ::string))
(s/def :Procedure/outcome ::CodeableConcept)
(s/def :Procedure/usedCode (s/coll-of ::CodeableConcept))
(s/def :Procedure/followUp (s/coll-of ::CodeableConcept))
(s/def :Procedure/basedOn (s/coll-of ::Reference))
(s/def :Procedure/subject ::Reference)
(s/def :Procedure/location ::Reference)
(s/def :Procedure/reasonCode (s/coll-of ::CodeableConcept))
(s/def :Procedure/category ::CodeableConcept)
(s/def :Procedure/status ::code)
(s/def :Procedure/language ::code)
(s/def :Procedure/performer (s/coll-of ::string))
(s/def :Procedure/definition (s/coll-of ::Reference))
(s/def :Procedure/usedReference (s/coll-of ::Reference))
(s/def :Procedure/complication (s/coll-of ::CodeableConcept))
(s/def :Procedure/code ::CodeableConcept)
(s/def :Procedure/text ::Narrative)
(s/def :Procedure/implicitRules ::uri)
(s/def :Procedure/bodySite (s/coll-of ::CodeableConcept))
(s/def :Procedure/context ::Reference)
(s/def :Procedure/partOf (s/coll-of ::Reference))
(s/def :Procedure/reasonReference (s/coll-of ::Reference))
(s/def :Procedure/note (s/coll-of ::Annotation))
(s/def :Procedure/meta ::Meta)
(s/def :Procedure/report (s/coll-of ::Reference))
(s/def :Procedure/identifier (s/coll-of ::Identifier))
(s/def :Procedure/complicationDetail (s/coll-of ::Reference))


;; Consent

(s/def :Consent/except (s/coll-of ::string))
(s/def :Consent/text ::Narrative)
(s/def :Consent/source ::string)
(s/def :Consent/action (s/coll-of ::CodeableConcept))
(s/def :Consent/policyRule ::uri)
(s/def :Consent/status ::code)
(s/def :Consent/purpose (s/coll-of ::Coding))
(s/def :Consent/securityLabel (s/coll-of ::Coding))
(s/def :Consent/identifier ::Identifier)
(s/def :Consent/language ::code)
(s/def :Consent/category (s/coll-of ::CodeableConcept))
(s/def :Consent/contained (s/coll-of ::Resource))
(s/def :Consent/consentingParty (s/coll-of ::Reference))
(s/def :Consent/id ::id)
(s/def :Consent/meta ::Meta)
(s/def :Consent/data (s/coll-of ::string))
(s/def :Consent/period ::Period)
(s/def :Consent/dateTime ::dateTime)
(s/def :Consent/patient ::Reference)
(s/def :Consent/actor (s/coll-of ::string))
(s/def :Consent/implicitRules ::uri)
(s/def :Consent/organization (s/coll-of ::Reference))
(s/def :Consent/policy (s/coll-of ::string))
(s/def :Consent/dataPeriod ::Period)


;; Attribute

(s/def :Attribute/order ::integer)
(s/def :Attribute/valueSet ::string)
(s/def :Attribute/isSummary ::boolean)
(s/def :Attribute/isModifier ::boolean)
(s/def :Attribute/refers (s/coll-of ::string))


;; Location

(s/def :Location/managingOrganization ::Reference)
(s/def :Location/telecom (s/coll-of ::ContactPoint))
(s/def :Location/implicitRules ::uri)
(s/def :Location/description ::string)
(s/def :Location/language ::code)
(s/def :Location/physicalType ::CodeableConcept)
(s/def :Location/identifier (s/coll-of ::Identifier))
(s/def :Location/mode ::code)
(s/def :Location/contained (s/coll-of ::Resource))
(s/def :Location/text ::Narrative)
(s/def :Location/endpoint (s/coll-of ::Reference))
(s/def :Location/position ::string)
(s/def :Location/name ::string)
(s/def :Location/status ::code)
(s/def :Location/id ::id)
(s/def :Location/partOf ::Reference)
(s/def :Location/address ::Address)
(s/def :Location/alias (s/coll-of ::string))
(s/def :Location/type ::CodeableConcept)
(s/def :Location/operationalStatus ::Coding)
(s/def :Location/meta ::Meta)


;; Organization

(s/def :Organization/alias (s/coll-of ::string))
(s/def :Organization/implicitRules ::uri)
(s/def :Organization/text ::Narrative)
(s/def :Organization/telecom (s/coll-of ::ContactPoint))
(s/def :Organization/id ::id)
(s/def :Organization/partOf ::Reference)
(s/def :Organization/meta ::Meta)
(s/def :Organization/language ::code)
(s/def :Organization/name ::string)
(s/def :Organization/identifier (s/coll-of ::Identifier))
(s/def :Organization/contained (s/coll-of ::Resource))
(s/def :Organization/endpoint (s/coll-of ::Reference))
(s/def :Organization/type (s/coll-of ::CodeableConcept))
(s/def :Organization/active ::boolean)
(s/def :Organization/address (s/coll-of ::Address))
(s/def :Organization/contact (s/coll-of ::string))


;; Device

(s/def :Device/patient ::Reference)
(s/def :Device/manufactureDate ::dateTime)
(s/def :Device/location ::Reference)
(s/def :Device/version ::string)
(s/def :Device/lotNumber ::string)
(s/def :Device/id ::id)
(s/def :Device/expirationDate ::dateTime)
(s/def :Device/meta ::Meta)
(s/def :Device/safety (s/coll-of ::CodeableConcept))
(s/def :Device/model ::string)
(s/def :Device/implicitRules ::uri)
(s/def :Device/identifier (s/coll-of ::Identifier))
(s/def :Device/status ::code)
(s/def :Device/text ::Narrative)
(s/def :Device/type ::CodeableConcept)
(s/def :Device/owner ::Reference)
(s/def :Device/note (s/coll-of ::Annotation))
(s/def :Device/udi ::string)
(s/def :Device/contact (s/coll-of ::ContactPoint))
(s/def :Device/url ::uri)
(s/def :Device/language ::code)
(s/def :Device/manufacturer ::string)
(s/def :Device/contained (s/coll-of ::Resource))


;; SupplyRequest

(s/def :SupplyRequest/text ::Narrative)
(s/def :SupplyRequest/id ::id)
(s/def :SupplyRequest/language ::code)
(s/def :SupplyRequest/supplier (s/coll-of ::Reference))
(s/def :SupplyRequest/meta ::Meta)
(s/def :SupplyRequest/status ::code)
(s/def :SupplyRequest/category ::CodeableConcept)
(s/def :SupplyRequest/reason ::string)
(s/def :SupplyRequest/deliverFrom ::Reference)
(s/def :SupplyRequest/deliverTo ::Reference)
(s/def :SupplyRequest/priority ::code)
(s/def :SupplyRequest/implicitRules ::uri)
(s/def :SupplyRequest/authoredOn ::dateTime)
(s/def :SupplyRequest/orderedItem ::string)
(s/def :SupplyRequest/identifier ::Identifier)
(s/def :SupplyRequest/requester ::string)
(s/def :SupplyRequest/contained (s/coll-of ::Resource))
(s/def :SupplyRequest/occurrence ::string)


;; AllergyIntolerance

(s/def :AllergyIntolerance/verificationStatus ::code)
(s/def :AllergyIntolerance/onset ::string)
(s/def :AllergyIntolerance/recorder ::Reference)
(s/def :AllergyIntolerance/asserter ::Reference)
(s/def :AllergyIntolerance/assertedDate ::dateTime)
(s/def :AllergyIntolerance/language ::code)
(s/def :AllergyIntolerance/identifier (s/coll-of ::Identifier))
(s/def :AllergyIntolerance/note (s/coll-of ::Annotation))
(s/def :AllergyIntolerance/clinicalStatus ::code)
(s/def :AllergyIntolerance/patient ::Reference)
(s/def :AllergyIntolerance/reaction (s/coll-of ::string))
(s/def :AllergyIntolerance/implicitRules ::uri)
(s/def :AllergyIntolerance/code ::CodeableConcept)
(s/def :AllergyIntolerance/meta ::Meta)
(s/def :AllergyIntolerance/category (s/coll-of ::code))
(s/def :AllergyIntolerance/text ::Narrative)
(s/def :AllergyIntolerance/lastOccurrence ::dateTime)
(s/def :AllergyIntolerance/id ::id)
(s/def :AllergyIntolerance/type ::code)
(s/def :AllergyIntolerance/contained (s/coll-of ::Resource))
(s/def :AllergyIntolerance/criticality ::code)


;; OperationDefinition

(s/def :OperationDefinition/base ::Reference)
(s/def :OperationDefinition/text ::Narrative)
(s/def :OperationDefinition/resource (s/coll-of ::code))
(s/def :OperationDefinition/overload (s/coll-of ::string))
(s/def :OperationDefinition/version ::string)
(s/def :OperationDefinition/kind ::code)
(s/def :OperationDefinition/contained (s/coll-of ::Resource))
(s/def :OperationDefinition/purpose ::markdown)
(s/def :OperationDefinition/language ::code)
(s/def :OperationDefinition/code ::code)
(s/def :OperationDefinition/date ::dateTime)
(s/def :OperationDefinition/idempotent ::boolean)
(s/def :OperationDefinition/useContext (s/coll-of ::UsageContext))
(s/def :OperationDefinition/status ::code)
(s/def :OperationDefinition/publisher ::string)
(s/def :OperationDefinition/instance ::boolean)
(s/def :OperationDefinition/implicitRules ::uri)
(s/def :OperationDefinition/experimental ::boolean)
(s/def :OperationDefinition/meta ::Meta)
(s/def :OperationDefinition/comment ::string)
(s/def :OperationDefinition/description ::markdown)
(s/def :OperationDefinition/system ::boolean)
(s/def :OperationDefinition/parameter (s/coll-of ::string))
(s/def :OperationDefinition/type ::boolean)
(s/def :OperationDefinition/url ::uri)
(s/def :OperationDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :OperationDefinition/id ::id)
(s/def :OperationDefinition/contact (s/coll-of ::ContactDetail))
(s/def :OperationDefinition/name ::string)


;; ImagingManifest

(s/def :ImagingManifest/description ::string)
(s/def :ImagingManifest/contained (s/coll-of ::Resource))
(s/def :ImagingManifest/identifier ::Identifier)
(s/def :ImagingManifest/patient ::Reference)
(s/def :ImagingManifest/id ::id)
(s/def :ImagingManifest/study (s/coll-of ::string))
(s/def :ImagingManifest/implicitRules ::uri)
(s/def :ImagingManifest/author ::Reference)
(s/def :ImagingManifest/authoringTime ::dateTime)
(s/def :ImagingManifest/meta ::Meta)
(s/def :ImagingManifest/language ::code)
(s/def :ImagingManifest/text ::Narrative)


;; ImagingStudy

(s/def :ImagingStudy/meta ::Meta)
(s/def :ImagingStudy/implicitRules ::uri)
(s/def :ImagingStudy/language ::code)
(s/def :ImagingStudy/reason ::CodeableConcept)
(s/def :ImagingStudy/description ::string)
(s/def :ImagingStudy/modalityList (s/coll-of ::Coding))
(s/def :ImagingStudy/context ::Reference)
(s/def :ImagingStudy/text ::Narrative)
(s/def :ImagingStudy/procedureReference (s/coll-of ::Reference))
(s/def :ImagingStudy/numberOfInstances ::unsignedInt)
(s/def :ImagingStudy/numberOfSeries ::unsignedInt)
(s/def :ImagingStudy/series (s/coll-of ::string))
(s/def :ImagingStudy/interpreter (s/coll-of ::Reference))
(s/def :ImagingStudy/id ::id)
(s/def :ImagingStudy/referrer ::Reference)
(s/def :ImagingStudy/procedureCode (s/coll-of ::CodeableConcept))
(s/def :ImagingStudy/started ::dateTime)
(s/def :ImagingStudy/accession ::Identifier)
(s/def :ImagingStudy/basedOn (s/coll-of ::Reference))
(s/def :ImagingStudy/endpoint (s/coll-of ::Reference))
(s/def :ImagingStudy/contained (s/coll-of ::Resource))
(s/def :ImagingStudy/uid ::oid)
(s/def :ImagingStudy/identifier (s/coll-of ::Identifier))
(s/def :ImagingStudy/availability ::code)
(s/def :ImagingStudy/patient ::Reference)


;; GuidanceResponse

(s/def :GuidanceResponse/dataRequirement (s/coll-of ::DataRequirement))
(s/def :GuidanceResponse/contained (s/coll-of ::Resource))
(s/def :GuidanceResponse/evaluationMessage (s/coll-of ::Reference))
(s/def :GuidanceResponse/reason ::string)
(s/def :GuidanceResponse/meta ::Meta)
(s/def :GuidanceResponse/id ::id)
(s/def :GuidanceResponse/performer ::Reference)
(s/def :GuidanceResponse/occurrenceDateTime ::dateTime)
(s/def :GuidanceResponse/note (s/coll-of ::Annotation))
(s/def :GuidanceResponse/text ::Narrative)
(s/def :GuidanceResponse/status ::code)
(s/def :GuidanceResponse/result ::Reference)
(s/def :GuidanceResponse/subject ::Reference)
(s/def :GuidanceResponse/implicitRules ::uri)
(s/def :GuidanceResponse/requestId ::id)
(s/def :GuidanceResponse/context ::Reference)
(s/def :GuidanceResponse/identifier ::Identifier)
(s/def :GuidanceResponse/language ::code)
(s/def :GuidanceResponse/module ::Reference)
(s/def :GuidanceResponse/outputParameters ::Reference)


;; Media

(s/def :Media/width ::positiveInt)
(s/def :Media/contained (s/coll-of ::Resource))
(s/def :Media/id ::id)
(s/def :Media/content ::Attachment)
(s/def :Media/type ::code)
(s/def :Media/language ::code)
(s/def :Media/frames ::positiveInt)
(s/def :Media/subtype ::CodeableConcept)
(s/def :Media/bodySite ::CodeableConcept)
(s/def :Media/reasonCode (s/coll-of ::CodeableConcept))
(s/def :Media/height ::positiveInt)
(s/def :Media/device ::Reference)
(s/def :Media/duration ::unsignedInt)
(s/def :Media/view ::CodeableConcept)
(s/def :Media/identifier (s/coll-of ::Identifier))
(s/def :Media/implicitRules ::uri)
(s/def :Media/meta ::Meta)
(s/def :Media/basedOn (s/coll-of ::Reference))
(s/def :Media/operator ::Reference)
(s/def :Media/occurrence ::string)
(s/def :Media/note (s/coll-of ::Annotation))
(s/def :Media/context ::Reference)
(s/def :Media/text ::Narrative)
(s/def :Media/subject ::Reference)


;; MeasureReport

(s/def :MeasureReport/implicitRules ::uri)
(s/def :MeasureReport/type ::code)
(s/def :MeasureReport/meta ::Meta)
(s/def :MeasureReport/status ::code)
(s/def :MeasureReport/period ::Period)
(s/def :MeasureReport/date ::dateTime)
(s/def :MeasureReport/identifier ::Identifier)
(s/def :MeasureReport/text ::Narrative)
(s/def :MeasureReport/reportingOrganization ::Reference)
(s/def :MeasureReport/language ::code)
(s/def :MeasureReport/measure ::Reference)
(s/def :MeasureReport/evaluatedResources ::Reference)
(s/def :MeasureReport/id ::id)
(s/def :MeasureReport/group (s/coll-of ::string))
(s/def :MeasureReport/patient ::Reference)
(s/def :MeasureReport/contained (s/coll-of ::Resource))


;; GraphDefinition

(s/def :GraphDefinition/meta ::Meta)
(s/def :GraphDefinition/experimental ::boolean)
(s/def :GraphDefinition/implicitRules ::uri)
(s/def :GraphDefinition/date ::dateTime)
(s/def :GraphDefinition/useContext (s/coll-of ::UsageContext))
(s/def :GraphDefinition/id ::id)
(s/def :GraphDefinition/status ::code)
(s/def :GraphDefinition/contact (s/coll-of ::ContactDetail))
(s/def :GraphDefinition/language ::code)
(s/def :GraphDefinition/version ::string)
(s/def :GraphDefinition/name ::string)
(s/def :GraphDefinition/profile ::uri)
(s/def :GraphDefinition/link (s/coll-of ::string))
(s/def :GraphDefinition/contained (s/coll-of ::Resource))
(s/def :GraphDefinition/text ::Narrative)
(s/def :GraphDefinition/purpose ::markdown)
(s/def :GraphDefinition/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :GraphDefinition/url ::uri)
(s/def :GraphDefinition/start ::code)
(s/def :GraphDefinition/description ::markdown)
(s/def :GraphDefinition/publisher ::string)


;; MetadataResource

(s/def :MetadataResource/version ::string)
(s/def :MetadataResource/title ::string)
(s/def :MetadataResource/description ::markdown)
(s/def :MetadataResource/language ::code)
(s/def :MetadataResource/jurisdiction (s/coll-of ::CodeableConcept))
(s/def :MetadataResource/id ::id)
(s/def :MetadataResource/implicitRules ::uri)
(s/def :MetadataResource/status ::code)
(s/def :MetadataResource/date ::dateTime)
(s/def :MetadataResource/contact (s/coll-of ::ContactDetail))
(s/def :MetadataResource/name ::string)
(s/def :MetadataResource/url ::uri)
(s/def :MetadataResource/contained (s/coll-of ::Resource))
(s/def :MetadataResource/meta ::Meta)
(s/def :MetadataResource/useContext (s/coll-of ::UsageContext))
(s/def :MetadataResource/experimental ::boolean)
(s/def :MetadataResource/text ::Narrative)
(s/def :MetadataResource/publisher ::string)


;; Timing

(s/def :Timing/repeat ::string)
(s/def :Timing/id ::string)
(s/def :Timing/event (s/coll-of ::dateTime))
(s/def :Timing/code ::CodeableConcept)


;; ElementDefinition

(s/def :ElementDefinition/comment ::markdown)
(s/def :ElementDefinition/meaningWhenMissing ::markdown)
(s/def :ElementDefinition/constraint (s/coll-of ::string))
(s/def :ElementDefinition/minValue ::string)
(s/def :ElementDefinition/maxValue ::string)
(s/def :ElementDefinition/isSummary ::boolean)
(s/def :ElementDefinition/mapping (s/coll-of ::string))
(s/def :ElementDefinition/id ::string)
(s/def :ElementDefinition/fixed ::string)
(s/def :ElementDefinition/defaultValue ::string)
(s/def :ElementDefinition/maxLength ::integer)
(s/def :ElementDefinition/max ::string)
(s/def :ElementDefinition/type (s/coll-of ::string))
(s/def :ElementDefinition/code (s/coll-of ::Coding))
(s/def :ElementDefinition/base ::string)
(s/def :ElementDefinition/requirements ::markdown)
(s/def :ElementDefinition/path ::string)
(s/def :ElementDefinition/alias (s/coll-of ::string))
(s/def :ElementDefinition/condition (s/coll-of ::id))
(s/def :ElementDefinition/pattern ::string)
(s/def :ElementDefinition/representation (s/coll-of ::code))
(s/def :ElementDefinition/mustSupport ::boolean)
(s/def :ElementDefinition/short ::string)
(s/def :ElementDefinition/definition ::markdown)
(s/def :ElementDefinition/binding ::string)
(s/def :ElementDefinition/contentReference ::uri)
(s/def :ElementDefinition/orderMeaning ::string)
(s/def :ElementDefinition/label ::string)
(s/def :ElementDefinition/example (s/coll-of ::string))
(s/def :ElementDefinition/slicing ::string)
(s/def :ElementDefinition/isModifier ::boolean)
(s/def :ElementDefinition/min ::unsignedInt)
(s/def :ElementDefinition/sliceName ::string)


;; Annotation

(s/def :Annotation/id ::string)
(s/def :Annotation/text ::string)
(s/def :Annotation/time ::dateTime)
(s/def :Annotation/author ::string)


;; SampledData

(s/def :SampledData/upperLimit ::decimal)
(s/def :SampledData/lowerLimit ::decimal)
(s/def :SampledData/factor ::decimal)
(s/def :SampledData/period ::decimal)
(s/def :SampledData/dimensions ::positiveInt)
(s/def :SampledData/id ::string)
(s/def :SampledData/origin ::Quantity)
(s/def :SampledData/data ::string)


;; Bundle

(s/def :Bundle/total ::unsignedInt)
(s/def :Bundle/entry (s/coll-of ::string))
(s/def :Bundle/implicitRules ::uri)
(s/def :Bundle/identifier ::Identifier)
(s/def :Bundle/link (s/coll-of ::string))
(s/def :Bundle/language ::code)
(s/def :Bundle/meta ::Meta)
(s/def :Bundle/signature ::Signature)
(s/def :Bundle/id ::id)
(s/def :Bundle/type ::code)


;; ContactPoint

(s/def :ContactPoint/period ::Period)
(s/def :ContactPoint/value ::string)
(s/def :ContactPoint/system ::code)
(s/def :ContactPoint/use ::code)
(s/def :ContactPoint/rank ::positiveInt)
(s/def :ContactPoint/id ::string)


;; Dosage

(s/def :Dosage/additionalInstruction (s/coll-of ::CodeableConcept))
(s/def :Dosage/dose ::string)
(s/def :Dosage/method ::CodeableConcept)
(s/def :Dosage/maxDosePerLifetime ::Quantity)
(s/def :Dosage/asNeeded ::string)
(s/def :Dosage/route ::CodeableConcept)
(s/def :Dosage/patientInstruction ::string)
(s/def :Dosage/rate ::string)
(s/def :Dosage/site ::CodeableConcept)
(s/def :Dosage/maxDosePerPeriod ::Ratio)
(s/def :Dosage/maxDosePerAdministration ::Quantity)
(s/def :Dosage/timing ::Timing)
(s/def :Dosage/sequence ::integer)
(s/def :Dosage/text ::string)
(s/def :Dosage/id ::string)


;; Address

(s/def :Address/postalCode ::string)
(s/def :Address/line (s/coll-of ::string))
(s/def :Address/period ::Period)
(s/def :Address/type ::code)
(s/def :Address/city ::string)
(s/def :Address/state ::string)
(s/def :Address/id ::string)
(s/def :Address/use ::code)
(s/def :Address/text ::string)
(s/def :Address/district ::string)
(s/def :Address/country ::string)


;; DataRequirement

(s/def :DataRequirement/profile (s/coll-of ::uri))
(s/def :DataRequirement/type ::code)
(s/def :DataRequirement/codeFilter (s/coll-of ::string))
(s/def :DataRequirement/dateFilter (s/coll-of ::string))
(s/def :DataRequirement/mustSupport (s/coll-of ::string))
(s/def :DataRequirement/id ::string)


;; ParameterDefinition

(s/def :ParameterDefinition/name ::code)
(s/def :ParameterDefinition/type ::code)
(s/def :ParameterDefinition/documentation ::string)
(s/def :ParameterDefinition/id ::string)
(s/def :ParameterDefinition/min ::integer)
(s/def :ParameterDefinition/max ::string)
(s/def :ParameterDefinition/use ::code)
(s/def :ParameterDefinition/profile ::Reference)


;; Coding

(s/def :Coding/system ::uri)
(s/def :Coding/code ::code)
(s/def :Coding/version ::string)
(s/def :Coding/display ::string)
(s/def :Coding/id ::string)
(s/def :Coding/userSelected ::boolean)


;; Attachment

(s/def :Attachment/title ::string)
(s/def :Attachment/url ::uri)
(s/def :Attachment/contentType ::code)
(s/def :Attachment/hash ::base64Binary)
(s/def :Attachment/data ::base64Binary)
(s/def :Attachment/size ::unsignedInt)
(s/def :Attachment/id ::string)
(s/def :Attachment/creation ::dateTime)
(s/def :Attachment/language ::code)


;; DomainResource

(s/def :DomainResource/implicitRules ::uri)
(s/def :DomainResource/language ::code)
(s/def :DomainResource/contained (s/coll-of ::Resource))
(s/def :DomainResource/meta ::Meta)
(s/def :DomainResource/id ::id)
(s/def :DomainResource/text ::Narrative)


;; Age

(s/def :Age/code ::code)
(s/def :Age/value ::decimal)
(s/def :Age/id ::string)
(s/def :Age/unit ::string)
(s/def :Age/system ::uri)
(s/def :Age/comparator ::code)


;; Ratio

(s/def :Ratio/denominator ::Quantity)
(s/def :Ratio/numerator ::Quantity)
(s/def :Ratio/id ::string)


;; RelatedArtifact

(s/def :RelatedArtifact/display ::string)
(s/def :RelatedArtifact/id ::string)
(s/def :RelatedArtifact/url ::uri)
(s/def :RelatedArtifact/resource ::Reference)
(s/def :RelatedArtifact/citation ::string)
(s/def :RelatedArtifact/type ::code)
(s/def :RelatedArtifact/document ::Attachment)


;; TriggerDefinition

(s/def :TriggerDefinition/eventName ::string)
(s/def :TriggerDefinition/id ::string)
(s/def :TriggerDefinition/eventData ::DataRequirement)
(s/def :TriggerDefinition/eventTiming ::string)
(s/def :TriggerDefinition/type ::code)


;; SimpleQuantity

(s/def :SimpleQuantity/comparator ::code)
(s/def :SimpleQuantity/value ::decimal)
(s/def :SimpleQuantity/code ::code)
(s/def :SimpleQuantity/id ::string)
(s/def :SimpleQuantity/system ::uri)
(s/def :SimpleQuantity/unit ::string)


;; Range

(s/def :Range/low ::Quantity)
(s/def :Range/high ::Quantity)
(s/def :Range/id ::string)


;; Signature

(s/def :Signature/when ::instant)
(s/def :Signature/id ::string)
(s/def :Signature/who ::string)
(s/def :Signature/onBehalfOf ::string)
(s/def :Signature/type (s/coll-of ::Coding))
(s/def :Signature/blob ::base64Binary)
(s/def :Signature/contentType ::code)


;; UsageContext

(s/def :UsageContext/id ::string)
(s/def :UsageContext/code ::Coding)
(s/def :UsageContext/value ::string)


;; Meta

(s/def :Meta/lastUpdated ::instant)
(s/def :Meta/id ::string)
(s/def :Meta/security (s/coll-of ::Coding))
(s/def :Meta/tag (s/coll-of ::Coding))
(s/def :Meta/profile (s/coll-of ::uri))
(s/def :Meta/versionId ::id)


;; Period

(s/def :Period/id ::string)
(s/def :Period/end ::dateTime)
(s/def :Period/start ::dateTime)


;; Distance

(s/def :Distance/id ::string)
(s/def :Distance/comparator ::code)
(s/def :Distance/value ::decimal)
(s/def :Distance/code ::code)
(s/def :Distance/system ::uri)
(s/def :Distance/unit ::string)


;; HumanName

(s/def :HumanName/suffix (s/coll-of ::string))
(s/def :HumanName/use ::code)
(s/def :HumanName/id ::string)
(s/def :HumanName/text ::string)
(s/def :HumanName/prefix (s/coll-of ::string))
(s/def :HumanName/given (s/coll-of ::string))
(s/def :HumanName/family ::string)
(s/def :HumanName/period ::Period)


;; Identifier

(s/def :Identifier/id ::string)
(s/def :Identifier/system ::uri)
(s/def :Identifier/value ::string)
(s/def :Identifier/period ::Period)
(s/def :Identifier/assigner ::Reference)
(s/def :Identifier/use ::code)
(s/def :Identifier/type ::CodeableConcept)


;; CodeableConcept

(s/def :CodeableConcept/id ::string)
(s/def :CodeableConcept/coding (s/coll-of ::Coding))
(s/def :CodeableConcept/text ::string)


;; Money

(s/def :Money/unit ::string)
(s/def :Money/comparator ::code)
(s/def :Money/value ::decimal)
(s/def :Money/id ::string)
(s/def :Money/code ::code)
(s/def :Money/system ::uri)


;; Duration

(s/def :Duration/code ::code)
(s/def :Duration/system ::uri)
(s/def :Duration/value ::decimal)
(s/def :Duration/comparator ::code)
(s/def :Duration/unit ::string)
(s/def :Duration/id ::string)


;; Narrative

(s/def :Narrative/div ::xhtml)
(s/def :Narrative/status ::code)
(s/def :Narrative/id ::string)


;; Contributor

(s/def :Contributor/id ::string)
(s/def :Contributor/name ::string)
(s/def :Contributor/type ::code)
(s/def :Contributor/contact (s/coll-of ::ContactDetail))


;; Resource

(s/def :Resource/language ::code)
(s/def :Resource/meta ::Meta)
(s/def :Resource/id ::id)
(s/def :Resource/implicitRules ::uri)


;; ContactDetail

(s/def :ContactDetail/name ::string)
(s/def :ContactDetail/telecom (s/coll-of ::ContactPoint))
(s/def :ContactDetail/id ::string)


;; Reference

(s/def :Reference/identifier ::Identifier)
(s/def :Reference/id ::string)
(s/def :Reference/display ::string)
(s/def :Reference/reference ::string)


;; Count

(s/def :Count/id ::string)
(s/def :Count/unit ::string)
(s/def :Count/code ::code)
(s/def :Count/system ::uri)
(s/def :Count/value ::decimal)
(s/def :Count/comparator ::code)


;; Quantity

(s/def :Quantity/value ::decimal)
(s/def :Quantity/id ::string)
(s/def :Quantity/unit ::string)
(s/def :Quantity/comparator ::code)
(s/def :Quantity/system ::uri)
(s/def :Quantity/code ::code)


;; Element

(s/def :Element/id ::string)


;; BackboneElement

(s/def :BackboneElement/id ::string)

