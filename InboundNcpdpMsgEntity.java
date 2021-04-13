package gov.va.med.pharmacy.persistence.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import gov.va.med.pharmacy.persistence.model.usertypes.InboundNcpdpMsgUserType;
/**
 * 
 * Modified entity for the table INBOUND_NCPDP_MSG without join columns.
 *
 */

@Entity(name = "InboundNcpdpMsgEntity")
@TypeDef(name = "InboundNcpdpMsgUserType", typeClass = InboundNcpdpMsgUserType.class)
@Table(name = "INBOUND_NCPDP_MSG", schema = "ERX")
public class InboundNcpdpMsgEntity implements java.io.Serializable {


	
	private static final long serialVersionUID = 1752786901264899331L;

	@Id	
	@SequenceGenerator(name="INB_MSG_SEQ_GEN", sequenceName="ERX.IB_NCPDP_MSG_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INB_MSG_SEQ_GEN")	
	@Column(name = "INBOUND_NCPDP_MSG_ID", unique = true, nullable = false, precision = 22, scale = 0)
	private long inboundNcpdpMsgId;
	
	@Column(name = "PATIENT_CHK_STATUS", nullable = false)
	private String erxStatusByPatientChkStatus;
	
	@Column(name = "MESSAGE_STATUS", nullable = false)
	private String erxStatusByMessageStatus;
	
	@Column(name = "PROVIDER_CHK_STATUS", nullable = false)
	private String erxStatusByProviderChkStatus;
	
	@Column(name = "DRUG_CHK_STATUS", nullable = false)
	private String erxStatusByDrugChkStatus;
	
	@Column(name = "PHARMACY_ID", nullable = false)
	private long pharmacyId;
	
	@Column(name = "MESSAGE_ID", length = 35)
	private String messageId;
	
	@Column(name = "REL_TO_MESSAGE_ID", length = 35)
	private String relToMessageId;
	
	@Column(name = "MESSAGE_TYPE", length = 35)
	private String messageType;
	
	@Column(name = "MESSAGE_FROM", length = 35)
	private String messageFrom;
	
	@Type(type = "gov.va.med.pharmacy.persistence.model.usertypes.InboundNcpdpMsgUserType") 
	@Column(name = "MESSAGE")
	private String message;
	
	@Column(name = "PATIENT_MATCH_DETAILS", length = 2000)
	private String patientMatchDetails;
	
	@Column(name = "PROVIDER_MATCH_DETAILS", length = 2000)
	private String providerMatchDetails;
	
	@Column(name = "DRUG_MATCH_DETAILS", length = 2000)
	private String drugMatchDetails;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "RECEIVED_DATE", length = 7)
	private Date receivedDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_DATE", length = 7)
	private Date updatedDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", length = 7)
	private Date createdDate;	
	
	@Column(name = "SCRIPT_VERSION", length = 10)
	private String scriptVersion;
	
	@Column (name = "ERX_TYPE", length = 10)
	private String erx_type;
	
	@Column (name = "SCHEDULE", length = 10)
	private String schedule;
	
	@Column (name = "DIGITAL_SIGNATURE", length = 10)
    private String digital_signature;
	
	public InboundNcpdpMsgEntity() {
	}

	
	public InboundNcpdpMsgEntity(long inboundNcpdpMsgId, String erxStatusByPatientChkStatus,
			String erxStatusByMessageStatus, String erxStatusByProviderChkStatus,
			String erxStatusByDrugChkStatus, long pharmacyId) {
		this.inboundNcpdpMsgId = inboundNcpdpMsgId;
		this.erxStatusByPatientChkStatus = erxStatusByPatientChkStatus;
		this.erxStatusByMessageStatus = erxStatusByMessageStatus;
		this.erxStatusByProviderChkStatus = erxStatusByProviderChkStatus;
		this.erxStatusByDrugChkStatus = erxStatusByDrugChkStatus;
		this.pharmacyId = pharmacyId;
	}
	
	
	public InboundNcpdpMsgEntity(long inboundNcpdpMsgId, String erxStatusByPatientChkStatus,
			String erxStatusByMessageStatus, String erxStatusByProviderChkStatus,
			String erxStatusByDrugChkStatus, long pharmacyId, String messageId, String relToMessageId,
			String messageFrom,String messageType, String message, String patientMatchDetails, String providerMatchDetails,
			String drugMatchDetails, Date receivedDate, Date updatedDate, Date createdDate, String scriptVersion) {
		this.inboundNcpdpMsgId = inboundNcpdpMsgId;
		this.erxStatusByPatientChkStatus = erxStatusByPatientChkStatus;
		this.erxStatusByMessageStatus = erxStatusByMessageStatus;
		this.erxStatusByProviderChkStatus = erxStatusByProviderChkStatus;
		this.erxStatusByDrugChkStatus = erxStatusByDrugChkStatus;
		this.pharmacyId = pharmacyId;
		this.messageId = messageId;
		this.relToMessageId = relToMessageId;
		this.messageFrom = messageFrom;
		this.messageType = messageType;
		this.message = message;
		this.patientMatchDetails = patientMatchDetails;
		this.providerMatchDetails = providerMatchDetails;
		this.drugMatchDetails = drugMatchDetails;
		this.receivedDate = receivedDate;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
		this.scriptVersion = scriptVersion;
		
	}
	
	

	
	public long getInboundNcpdpMsgId() {
		return this.inboundNcpdpMsgId;
	}

	public void setInboundNcpdpMsgId(long inboundNcpdpMsgId) {
		this.inboundNcpdpMsgId = inboundNcpdpMsgId;
	}

	
	
	public String getErxStatusByPatientChkStatus() {
		return this.erxStatusByPatientChkStatus;
	}

	public void setErxStatusByPatientChkStatus(String erxStatusByPatientChkStatus) {
		this.erxStatusByPatientChkStatus = erxStatusByPatientChkStatus;
	}

	
	
	public String getErxStatusByMessageStatus() {
		return this.erxStatusByMessageStatus;
	}

	public void setErxStatusByMessageStatus(String erxStatusByMessageStatus) {
		this.erxStatusByMessageStatus = erxStatusByMessageStatus;
	}

	
	
	public String getErxStatusByProviderChkStatus() {
		return this.erxStatusByProviderChkStatus;
	}

	public void setErxStatusByProviderChkStatus(String erxStatusByProviderChkStatus) {
		this.erxStatusByProviderChkStatus = erxStatusByProviderChkStatus;
	}

	
	
	public String getErxStatusByDrugChkStatus() {
		return this.erxStatusByDrugChkStatus;
	}

	public void setErxStatusByDrugChkStatus(String erxStatusByDrugChkStatus) {
		this.erxStatusByDrugChkStatus = erxStatusByDrugChkStatus;
	}

	
	
	public long getPharmacyId() {
		return pharmacyId;
	}


	public void setPharmacyId(long pharmacyId) {
		this.pharmacyId = pharmacyId;
	}
	

	
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	
	public String getRelToMessageId() {
		return this.relToMessageId;
	}

	public void setRelToMessageId(String relToMessageId) {
		this.relToMessageId = relToMessageId;
	}

	public String getMessageFrom() {
		return this.messageFrom;
	}

	public void setMessageFrom(String messageFrom) {
		this.messageFrom = messageFrom;
	}
	
	
	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	
	
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public String getPatientMatchDetails() {
		return this.patientMatchDetails;
	}

	public void setPatientMatchDetails(String patientMatchDetails) {
		this.patientMatchDetails = patientMatchDetails;
	}

	
	public String getProviderMatchDetails() {
		return this.providerMatchDetails;
	}

	public void setProviderMatchDetails(String providerMatchDetails) {
		this.providerMatchDetails = providerMatchDetails;
	}

	
	public String getDrugMatchDetails() {
		return this.drugMatchDetails;
	}

	public void setDrugMatchDetails(String drugMatchDetails) {
		this.drugMatchDetails = drugMatchDetails;
	}

	
	public Date getReceivedDate() {
		return this.receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getScriptVersion() {
		return this.scriptVersion;
	}

	public void setScriptVersion(String scriptVersion) {
		this.scriptVersion = scriptVersion;
	}
	
	public void seterxtype(String erxtype) {
		this.erx_type = erxtype;
	}
	
	public String geterxtype() {
		return this.erx_type;
	}
	
	public void setschedule(String schdl) {
		this.schedule = schdl;
	}
	
	public String getschedule() {
		return this.schedule;
	}
	
	public void setdigitalsignature(String dig_signature) {
		this.digital_signature = dig_signature;
	}
	
	public String getdigitalsignature() {
		return this.digital_signature;
	}
}
