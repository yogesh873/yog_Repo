package ingov.itd.iec.cpc.api.entity;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tds_receipt_all_unq", schema = "receipt_store")
public class TdsReceiptAllUnq {
	/**
	 * Generated version uid.
	 */
	private static final long serialVersionUID = -2367340245199802529L;

	/** The receipt id. */
	@Id
	@Column(name = "receipt_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tds_rec_sequence")
	@SequenceGenerator(name = "tds_rec_sequence", sequenceName = "tds_receipt_all_receipt_id_seq", allocationSize = 1)
	private Long receiptId;

	/** The receipt number. */
	@Column(name = "receipt_number")
	private String receiptNumber;

	/** The receipt type. */
	@Column(name = "receipt_type")
	private String receiptType;

	/** The receipt amount. */
	@Column(name = "receipt_amount")
	private BigInteger receiptAmount;

	/** The receipt date. */
	@Column(name = "receipt_date")
	private Date receiptDate;

	/** The receipt gl date. */
	@Column(name = "receipt_gl_date")
	private Date receiptGlDate;

	/** The pan number. */
	@Column(name = "pan_number")
	private String panNumber;

	/** The receipt cntl id. */
	@Column(name = "receipt_cntl_id")
	private Long receiptCntlId;

	/** The pan number. */
	@Column(name = "receipt_cntl_status")
	private String receiptCntlStatus;

	/** The receipt status. */
	@Column(name = "receipt_status")
	private String receiptStatus;

	/** The error code. */
	@Column(name = "error_code")
	private String errorCode;

	/** The major head. */
	@Column(name = "major_head")
	private String majorHead;

	/** The minor head. */
	@Column(name = "minor_head")
	private String minorHead;

	/** The receipt flag. */
	@Column(name = "receipt_flag")
	private String receiptFlag;

	/** The tds section code. */
	@Column(name = "tds_section_code")
	private String tdsSectionCode;

	/** The tan number. */
	@Column(name = "tan_number")
	private String tanNumber;

	/** The assessment year. */
	@Column(name = "assessment_year")
	private Integer assessmentYear;

	/** The smry receipt id. */
	@Column(name = "smry_receipt_id")
	private Long smryReceiptId;

	/** The unique source trx id. */
	@Column(name = "unique_source_trx_id")
	private String uniqueSourceTrxId;

	/** The invoice num. */
	@Column(name = "invoice_num")
	private String invoiceNum;

	/** The form type code. */
	@Column(name = "form_type_code")
	private String formTypeCode;

	/** The unique trx number. */
	@Column(name = "unique_trx_number")
	private String uniqueTrxNumber;

	/** The matching flag. */
	@Column(name = "matching_flag")
	private String matchingFlag;

	/** The tan name. */
	@Column(name = "tan_name")
	private String tanName;

	/** The pan name. */
	@Column(name = "pan_name")
	private String panName;

	/** The receipt time stamp. */
	@Column(name = "receipt_time_stamp")
	private Timestamp receiptTimeStamp;

	/** The receipt filename. */
	@Column(name = "receipt_filename")
	private String receiptFilename;

	/** The receipt qlty. */
	@Column(name = "receipt_qlty")
	private String receiptQlty;

	/** The tds cert num. */
	@Column(name = "tds_cert_num")
	private String tdsCertNum;

	/** The uid flg. */
	@Column(name = "uid_flg")
	private String uidFlg;

	/** The amt paid crdtd. */
	@Column(name = "amt_paid_crdtd")
	private BigInteger amtPaidCrdtd;

	/** The reversal receipt_id. */
	@Column(name = "reversal_receipt_id")
	private Long reversalReceiptId;

	/** The reversal reason code. */
	@Column(name = "reversal_reason_code")
	private String reversalReasonCode;

	/** The reversal date. */
	@Column(name = "reversal_date")
	private Date reversalDate;

	/** The last updated tmstmp. */
	@Column(name = "last_updated_tmstmp")
	private Timestamp lastUpdatedTmstmp;

	/** The last updated by. */
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	/** The created tmstmp. */
	@Column(name = "created_tmstmp")
	private Timestamp createdTmstmp;

	/** The created by. */
	@Column(name = "created_by")
	private String createdBy;

	/** The gl flag. */
	@Column(name = "gl_flag")
	private String glFlag;

	/** The gl tmstmp. */
	@Column(name = "gl_tmstmp")
	private Timestamp glTmstmp;

	/** The is migrated. */
	@Column(name = "is_migrated")
	private String isMigrated;

	/** The transaction type. */
	@Column(name = "transaction_type")
	private String transactionType;

	/** The source read tmstmp. */
	@Column(name = "source_read_tmstmp")
	private Timestamp sourceReadTmstmp;

	/** The validation start tmstmp. */
	@Column(name = "validation_start_tmstmp")
	private Timestamp validationStartTmstmp;

	/** The validation end tmstmp. */
	@Column(name = "validation_end_tmstmp")
	private Timestamp validationEndTmstmp;

	/** The batch id. */
	@Column(name = "batch_id")
	private BigInteger batchId;

	/** The batch type. */
	@Column(name = "batch_type")
	private String batchType;

	/** The cin num. */
	@Column(name = "cin_num")
	private String cinNum;

	/** The tds 26as out id. */
	@Column(name = "tds_26as_out_id")
	private BigInteger tds26asOutId;

	/** The currency code. */
	@Column(name = "currency_code")
	public String currencyCode;

	/** The education cess. */
	@Column(name = "education_cess")
	private BigInteger educationCess;

	/** The base tax. */
	@Column(name = "base_tax")
	private BigInteger baseTax;

	/** The surcharge. */
	@Column(name = "surcharge")
	private BigInteger surcharge;

	/** The amt interest. */
	@Column(name = "amt_interest")
	private BigInteger amtInterest;

	/** The amt pnlty. */
	@Column(name = "amt_pnlty")
	private BigInteger amtPnlty;

	/** The amt oth. */
	@Column(name = "amt_oth")
	private BigInteger amtOth;

	/** The intrest code. */
	@Column(name = "intrest_code")
	private String intrestCode;

	/** The penalty code. */
	@Column(name = "penalty_code")
	private String penaltyCode;

	/** The oth code. */
	@Column(name = "oth_code")
	private String othCode;

	/** The concat field. */
	@Column(name = "concat_field")
	private String concatField;

	/**
	 * Gets the receipt id.
	 *
	 * @return the receipt id
	 */
	public Long getReceiptId() {
		return receiptId;
	}

	/**
	 * Sets the receipt id.
	 *
	 * @param receiptId the new receipt id
	 */
	public void setReceiptId(Long receiptId) {
		this.receiptId = receiptId;
	}

	/**
	 * Gets the receipt number.
	 *
	 * @return the receipt number
	 */
	public String getReceiptNumber() {
		return receiptNumber;
	}

	/**
	 * Sets the receipt number.
	 *
	 * @param receiptNumber the new receipt number
	 */
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	/**
	 * Gets the receipt type.
	 *
	 * @return the receipt type
	 */
	public String getReceiptType() {
		return receiptType;
	}

	/**
	 * Sets the receipt type.
	 *
	 * @param receiptType the new receipt type
	 */
	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

	/**
	 * Gets the receipt amount.
	 *
	 * @return the receipt amount
	 */
	public BigInteger getReceiptAmount() {
		return receiptAmount;
	}

	/**
	 * Sets the receipt amount.
	 *
	 * @param receiptAmount the new receipt amount
	 */
	public void setReceiptAmount(BigInteger receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	/**
	 * Gets the receipt date.
	 *
	 * @return the receipt date
	 */
	public Date getReceiptDate() {
		return receiptDate;
	}

	/**
	 * Sets the receipt date.
	 *
	 * @param receiptDate the new receipt date
	 */
	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	/**
	 * Gets the receipt gl date.
	 *
	 * @return the receipt gl date
	 */
	public Date getReceiptGlDate() {
		return receiptGlDate;
	}

	/**
	 * Sets the receipt gl date.
	 *
	 * @param receiptGlDate the new receipt gl date
	 */
	public void setReceiptGlDate(Date receiptGlDate) {
		this.receiptGlDate = receiptGlDate;
	}

	/**
	 * Gets the pan number.
	 *
	 * @return the pan number
	 */
	public String getPanNumber() {
		return panNumber;
	}

	/**
	 * Sets the pan number.
	 *
	 * @param panNumber the new pan number
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	/**
	 * Gets the receipt cntl id.
	 *
	 * @return the receipt cntl id
	 */
	public Long getReceiptCntlId() {
		return receiptCntlId;
	}

	/**
	 * Sets the receipt cntl id.
	 *
	 * @param receiptCntlId the new receipt cntl id
	 */
	public void setReceiptCntlId(Long receiptCntlId) {
		this.receiptCntlId = receiptCntlId;
	}

	/**
	 * Gets the receipt cntl status.
	 *
	 * @return the receipt cntl status
	 */
	public String getReceiptCntlStatus() {
		return receiptCntlStatus;
	}

	/**
	 * Sets the receipt cntl status.
	 *
	 * @param receiptCntlStatus the new receipt cntl status
	 */
	public void setReceiptCntlStatus(String receiptCntlStatus) {
		this.receiptCntlStatus = receiptCntlStatus;
	}

	/**
	 * Gets the receipt status.
	 *
	 * @return the receipt status
	 */
	public String getReceiptStatus() {
		return receiptStatus;
	}

	/**
	 * Sets the receipt status.
	 *
	 * @param receiptStatus the new receipt status
	 */
	public void setReceiptStatus(String receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Sets the error code.
	 *
	 * @param errorCode the new error code
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Gets the major head.
	 *
	 * @return the major head
	 */
	public String getMajorHead() {
		return majorHead;
	}

	/**
	 * Sets the major head.
	 *
	 * @param majorHead the new major head
	 */
	public void setMajorHead(String majorHead) {
		this.majorHead = majorHead;
	}

	/**
	 * Gets the minor head.
	 *
	 * @return the minor head
	 */
	public String getMinorHead() {
		return minorHead;
	}

	/**
	 * Sets the minor head.
	 *
	 * @param minorHead the new minor head
	 */
	public void setMinorHead(String minorHead) {
		this.minorHead = minorHead;
	}

	/**
	 * Gets the receipt flag.
	 *
	 * @return the receipt flag
	 */
	public String getReceiptFlag() {
		return receiptFlag;
	}

	/**
	 * Sets the receipt flag.
	 *
	 * @param receiptFlag the new receipt flag
	 */
	public void setReceiptFlag(String receiptFlag) {
		this.receiptFlag = receiptFlag;
	}

	/**
	 * Gets the tds section code.
	 *
	 * @return the tds section code
	 */
	public String getTdsSectionCode() {
		return tdsSectionCode;
	}

	/**
	 * Sets the tds section code.
	 *
	 * @param tdsSectionCode the new tds section code
	 */
	public void setTdsSectionCode(String tdsSectionCode) {
		this.tdsSectionCode = tdsSectionCode;
	}

	/**
	 * Gets the tan number.
	 *
	 * @return the tan number
	 */
	public String getTanNumber() {
		return tanNumber;
	}

	/**
	 * Sets the tan number.
	 *
	 * @param tanNumber the new tan number
	 */
	public void setTanNumber(String tanNumber) {
		this.tanNumber = tanNumber;
	}

	/**
	 * Gets the assessment year.
	 *
	 * @return the assessment year
	 */
	public Integer getAssessmentYear() {
		return assessmentYear;
	}

	/**
	 * Sets the assessment year.
	 *
	 * @param assessmentYear the new assessment year
	 */
	public void setAssessmentYear(Integer assessmentYear) {
		this.assessmentYear = assessmentYear;
	}

	/**
	 * Gets the smry receipt id.
	 *
	 * @return the smry receipt id
	 */
	public Long getSmryReceiptId() {
		return smryReceiptId;
	}

	/**
	 * Sets the smry receipt id.
	 *
	 * @param smryReceiptId the new smry receipt id
	 */
	public void setSmryReceiptId(Long smryReceiptId) {
		this.smryReceiptId = smryReceiptId;
	}

	/**
	 * Gets the unique source trx id.
	 *
	 * @return the unique source trx id
	 */
	public String getUniqueSourceTrxId() {
		return uniqueSourceTrxId;
	}

	/**
	 * Sets the unique source trx id.
	 *
	 * @param uniqueSourceTrxId the new unique source trx id
	 */
	public void setUniqueSourceTrxId(String uniqueSourceTrxId) {
		this.uniqueSourceTrxId = uniqueSourceTrxId;
	}

	/**
	 * Gets the invoice num.
	 *
	 * @return the invoice num
	 */
	public String getInvoiceNum() {
		return invoiceNum;
	}

	/**
	 * Sets the invoice num.
	 *
	 * @param invoiceNum the new invoice num
	 */
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	/**
	 * Gets the form type code.
	 *
	 * @return the form type code
	 */
	public String getFormTypeCode() {
		return formTypeCode;
	}

	/**
	 * Sets the form type code.
	 *
	 * @param formTypeCode the new form type code
	 */
	public void setFormTypeCode(String formTypeCode) {
		this.formTypeCode = formTypeCode;
	}

	/**
	 * Gets the unique trx number.
	 *
	 * @return the unique trx number
	 */
	public String getUniqueTrxNumber() {
		return uniqueTrxNumber;
	}

	/**
	 * Sets the unique trx number.
	 *
	 * @param uniqueTrxNumber the new unique trx number
	 */
	public void setUniqueTrxNumber(String uniqueTrxNumber) {
		this.uniqueTrxNumber = uniqueTrxNumber;
	}

	/**
	 * Gets the matching flag.
	 *
	 * @return the matching flag
	 */
	public String getMatchingFlag() {
		return matchingFlag;
	}

	/**
	 * Sets the matching flag.
	 *
	 * @param matchingFlag the new matching flag
	 */
	public void setMatchingFlag(String matchingFlag) {
		this.matchingFlag = matchingFlag;
	}

	/**
	 * Gets the tan name.
	 *
	 * @return the tan name
	 */
	public String getTanName() {
		return tanName;
	}

	/**
	 * Sets the tan name.
	 *
	 * @param tanName the new tan name
	 */
	public void setTanName(String tanName) {
		this.tanName = tanName;
	}

	/**
	 * Gets the pan name.
	 *
	 * @return the pan name
	 */
	public String getPanName() {
		return panName;
	}

	/**
	 * Sets the pan name.
	 *
	 * @param panName the new pan name
	 */
	public void setPanName(String panName) {
		this.panName = panName;
	}

	/**
	 * Gets the receipt time stamp.
	 *
	 * @return the receipt time stamp
	 */
	public Timestamp getReceiptTimeStamp() {
		return receiptTimeStamp;
	}

	/**
	 * Sets the receipt time stamp.
	 *
	 * @param receiptTimeStamp the new receipt time stamp
	 */
	public void setReceiptTimeStamp(Timestamp receiptTimeStamp) {
		this.receiptTimeStamp = receiptTimeStamp;
	}

	/**
	 * Gets the receipt filename.
	 *
	 * @return the receipt filename
	 */
	public String getReceiptFilename() {
		return receiptFilename;
	}

	/**
	 * Sets the receipt filename.
	 *
	 * @param receiptFilename the new receipt filename
	 */
	public void setReceiptFilename(String receiptFilename) {
		this.receiptFilename = receiptFilename;
	}

	/**
	 * Gets the receipt qlty.
	 *
	 * @return the receipt qlty
	 */
	public String getReceiptQlty() {
		return receiptQlty;
	}

	/**
	 * Sets the receipt qlty.
	 *
	 * @param receiptQlty the new receipt qlty
	 */
	public void setReceiptQlty(String receiptQlty) {
		this.receiptQlty = receiptQlty;
	}

	/**
	 * Gets the tds cert num.
	 *
	 * @return the tds cert num
	 */
	public String getTdsCertNum() {
		return tdsCertNum;
	}

	/**
	 * Sets the tds cert num.
	 *
	 * @param tdsCertNum the new tds cert num
	 */
	public void setTdsCertNum(String tdsCertNum) {
		this.tdsCertNum = tdsCertNum;
	}

	/**
	 * Gets the uid flg.
	 *
	 * @return the uid flg
	 */
	public String getUidFlg() {
		return uidFlg;
	}

	/**
	 * Sets the uid flg.
	 *
	 * @param uidFlg the new uid flg
	 */
	public void setUidFlg(String uidFlg) {
		this.uidFlg = uidFlg;
	}

	/**
	 * Gets the amt paid crdtd.
	 *
	 * @return the amt paid crdtd
	 */
	public BigInteger getAmtPaidCrdtd() {
		return amtPaidCrdtd;
	}

	/**
	 * Sets the amt paid crdtd.
	 *
	 * @param amtPaidCrdtd the new amt paid crdtd
	 */
	public void setAmtPaidCrdtd(BigInteger amtPaidCrdtd) {
		this.amtPaidCrdtd = amtPaidCrdtd;
	}

	/**
	 * Gets the reversal receipt id.
	 *
	 * @return the reversal receipt id
	 */
	public Long getReversalReceiptId() {
		return reversalReceiptId;
	}

	/**
	 * Sets the reversal receipt id.
	 *
	 * @param reversalReceiptId the new reversal receipt id
	 */
	public void setReversalReceiptId(Long reversalReceiptId) {
		this.reversalReceiptId = reversalReceiptId;
	}

	/**
	 * Gets the reversal reason code.
	 *
	 * @return the reversal reason code
	 */
	public String getReversalReasonCode() {
		return reversalReasonCode;
	}

	/**
	 * Sets the reversal reason code.
	 *
	 * @param reversalReasonCode the new reversal reason code
	 */
	public void setReversalReasonCode(String reversalReasonCode) {
		this.reversalReasonCode = reversalReasonCode;
	}

	/**
	 * Gets the reversal date.
	 *
	 * @return the reversal date
	 */
	public Date getReversalDate() {
		return reversalDate;
	}

	/**
	 * Sets the reversal date.
	 *
	 * @param reversalDate the new reversal date
	 */
	public void setReversalDate(Date reversalDate) {
		this.reversalDate = reversalDate;
	}

	/**
	 * Gets the last updated tmstmp.
	 *
	 * @return the last updated tmstmp
	 */
	public Timestamp getLastUpdatedTmstmp() {
		return lastUpdatedTmstmp;
	}

	/**
	 * Sets the last updated tmstmp.
	 *
	 * @param lastUpdatedTmstmp the new last updated tmstmp
	 */
	public void setLastUpdatedTmstmp(Timestamp lastUpdatedTmstmp) {
		this.lastUpdatedTmstmp = lastUpdatedTmstmp;
	}

	/**
	 * Gets the last updated by.
	 *
	 * @return the last updated by
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	/**
	 * Sets the last updated by.
	 *
	 * @param lastUpdatedBy the new last updated by
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	/**
	 * Gets the created tmstmp.
	 *
	 * @return the created tmstmp
	 */
	public Timestamp getCreatedTmstmp() {
		return createdTmstmp;
	}

	/**
	 * Sets the created tmstmp.
	 *
	 * @param createdTmstmp the new created tmstmp
	 */
	public void setCreatedTmstmp(Timestamp createdTmstmp) {
		this.createdTmstmp = createdTmstmp;
	}

	/**
	 * Gets the created by.
	 *
	 * @return the created by
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the created by.
	 *
	 * @param createdBy the new created by
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Gets the gl flag.
	 *
	 * @return the gl flag
	 */
	public String getGlFlag() {
		return glFlag;
	}

	/**
	 * Sets the gl flag.
	 *
	 * @param glFlag the new gl flag
	 */
	public void setGlFlag(String glFlag) {
		this.glFlag = glFlag;
	}

	/**
	 * Gets the gl tmstmp.
	 *
	 * @return the gl tmstmp
	 */
	public Timestamp getGlTmstmp() {
		return glTmstmp;
	}

	/**
	 * Sets the gl tmstmp.
	 *
	 * @param glTmstmp the new gl tmstmp
	 */
	public void setGlTmstmp(Timestamp glTmstmp) {
		this.glTmstmp = glTmstmp;
	}

	/**
	 * Gets the checks if is migrated.
	 *
	 * @return the checks if is migrated
	 */
	public String getIsMigrated() {
		return isMigrated;
	}

	/**
	 * Sets the checks if is migrated.
	 *
	 * @param isMigrated the new checks if is migrated
	 */
	public void setIsMigrated(String isMigrated) {
		this.isMigrated = isMigrated;
	}

	/**
	 * Gets the transaction type.
	 *
	 * @return the transaction type
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the transaction type.
	 *
	 * @param transactionType the new transaction type
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Gets the source read tmstmp.
	 *
	 * @return the source read tmstmp
	 */
	public Timestamp getSourceReadTmstmp() {
		return sourceReadTmstmp;
	}

	/**
	 * Sets the source read tmstmp.
	 *
	 * @param sourceReadTmstmp the new source read tmstmp
	 */
	public void setSourceReadTmstmp(Timestamp sourceReadTmstmp) {
		this.sourceReadTmstmp = sourceReadTmstmp;
	}

	/**
	 * Gets the validation start tmstmp.
	 *
	 * @return the validation start tmstmp
	 */
	public Timestamp getValidationStartTmstmp() {
		return validationStartTmstmp;
	}

	/**
	 * Sets the validation start tmstmp.
	 *
	 * @param validationStartTmstmp the new validation start tmstmp
	 */
	public void setValidationStartTmstmp(Timestamp validationStartTmstmp) {
		this.validationStartTmstmp = validationStartTmstmp;
	}

	/**
	 * Gets the validation end tmstmp.
	 *
	 * @return the validation end tmstmp
	 */
	public Timestamp getValidationEndTmstmp() {
		return validationEndTmstmp;
	}

	/**
	 * Sets the validation end tmstmp.
	 *
	 * @param validationEndTmstmp the new validation end tmstmp
	 */
	public void setValidationEndTmstmp(Timestamp validationEndTmstmp) {
		this.validationEndTmstmp = validationEndTmstmp;
	}

	/**
	 * Gets the batch id.
	 *
	 * @return the batch id
	 */
	public BigInteger getBatchId() {
		return batchId;
	}

	/**
	 * Sets the batch id.
	 *
	 * @param batchId the new batch id
	 */
	public void setBatchId(BigInteger batchId) {
		this.batchId = batchId;
	}

	/**
	 * Gets the batch type.
	 *
	 * @return the batch type
	 */
	public String getBatchType() {
		return batchType;
	}

	/**
	 * Sets the batch type.
	 *
	 * @param batchType the new batch type
	 */
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	/**
	 * Gets the cin num.
	 *
	 * @return the cin num
	 */
	public String getCinNum() {
		return cinNum;
	}

	/**
	 * Sets the cin num.
	 *
	 * @param cinNum the new cin num
	 */
	public void setCinNum(String cinNum) {
		this.cinNum = cinNum;
	}

	/**
	 * Gets the tds 26 as out id.
	 *
	 * @return the tds 26 as out id
	 */
	public BigInteger getTds26asOutId() {
		return tds26asOutId;
	}

	/**
	 * Sets the tds 26 as out id.
	 *
	 * @param tds26asOutId the new tds 26 as out id
	 */
	public void setTds26asOutId(BigInteger tds26asOutId) {
		this.tds26asOutId = tds26asOutId;
	}

	/**
	 * Gets the currency code.
	 *
	 * @return the currency code
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Sets the currency code.
	 *
	 * @param currencyCode the new currency code
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Gets the education cess.
	 *
	 * @return the education cess
	 */
	public BigInteger getEducationCess() {
		return educationCess;
	}

	/**
	 * Sets the education cess.
	 *
	 * @param educationCess the new education cess
	 */
	public void setEducationCess(BigInteger educationCess) {
		this.educationCess = educationCess;
	}

	/**
	 * Gets the base tax.
	 *
	 * @return the base tax
	 */
	public BigInteger getBaseTax() {
		return baseTax;
	}

	/**
	 * Sets the base tax.
	 *
	 * @param baseTax the new base tax
	 */
	public void setBaseTax(BigInteger baseTax) {
		this.baseTax = baseTax;
	}

	/**
	 * Gets the surcharge.
	 *
	 * @return the surcharge
	 */
	public BigInteger getSurcharge() {
		return surcharge;
	}

	/**
	 * Sets the surcharge.
	 *
	 * @param surcharge the new surcharge
	 */
	public void setSurcharge(BigInteger surcharge) {
		this.surcharge = surcharge;
	}

	/**
	 * Gets the amt interest.
	 *
	 * @return the amt interest
	 */
	public BigInteger getAmtInterest() {
		return amtInterest;
	}

	/**
	 * Sets the amt interest.
	 *
	 * @param amtInterest the new amt interest
	 */
	public void setAmtInterest(BigInteger amtInterest) {
		this.amtInterest = amtInterest;
	}

	/**
	 * Gets the amt pnlty.
	 *
	 * @return the amt pnlty
	 */
	public BigInteger getAmtPnlty() {
		return amtPnlty;
	}

	/**
	 * Sets the amt pnlty.
	 *
	 * @param amtPnlty the new amt pnlty
	 */
	public void setAmtPnlty(BigInteger amtPnlty) {
		this.amtPnlty = amtPnlty;
	}

	/**
	 * Gets the amt oth.
	 *
	 * @return the amt oth
	 */
	public BigInteger getAmtOth() {
		return amtOth;
	}

	/**
	 * Sets the amt oth.
	 *
	 * @param amtOth the new amt oth
	 */
	public void setAmtOth(BigInteger amtOth) {
		this.amtOth = amtOth;
	}

	/**
	 * Gets the intrest code.
	 *
	 * @return the intrest code
	 */
	public String getIntrestCode() {
		return intrestCode;
	}

	/**
	 * Sets the intrest code.
	 *
	 * @param intrestCode the new intrest code
	 */
	public void setIntrestCode(String intrestCode) {
		this.intrestCode = intrestCode;
	}

	/**
	 * Gets the penalty code.
	 *
	 * @return the penalty code
	 */
	public String getPenaltyCode() {
		return penaltyCode;
	}

	/**
	 * Sets the penalty code.
	 *
	 * @param penaltyCode the new penalty code
	 */
	public void setPenaltyCode(String penaltyCode) {
		this.penaltyCode = penaltyCode;
	}

	/**
	 * Gets the oth code.
	 *
	 * @return the oth code
	 */
	public String getOthCode() {
		return othCode;
	}

	/**
	 * Sets the oth code.
	 *
	 * @param othCode the new oth code
	 */
	public void setOthCode(String othCode) {
		this.othCode = othCode;
	}

	/**
	 * Gets the concat field.
	 *
	 * @return the concat field
	 */
	public String getConcatField() {
		return concatField;
	}

	/**
	 * Sets the concat field.
	 *
	 * @param concatField the new concat field
	 */
	public void setConcatField(String concatField) {
		this.concatField = concatField;
	}

}


