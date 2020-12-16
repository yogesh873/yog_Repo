package ingov.itd.iec.cpc.api.entity;


	// Generated Aug 28, 2020, 5:57:03 PM by Hibernate Tools 5.4.2.Final

	import java.math.BigDecimal;
	import java.math.BigInteger;
	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	/**
	 * Tds26asOutbndStg generated by hbm2java.
	 *
	 * @author aruna02
	 * @version 1.0
	 * @since Sep 24, 2020
	 */
	@Entity
	@Table(name = "TDS_26AS_OUTBND_STG", schema = "CPCETLUSER")
	public class Tds26asOutbndStg implements java.io.Serializable {

		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;

		/** The tds 26 as out id. */
		private Long tds26asOutId;

		/** The batch id. */
		private BigInteger batchId;

		/** The dd status. */
		private char ddStatus;

		/** The assess year. */
		private short assessYear;

		/** The ded pan. */
		private String dedPan;

		/** The ded tan. */
		private String dedTan;

		/** The sec code. */
		private String secCode;

		/** The dt pmnt crdt. */
		private Date dtPmntCrdt;

		/** The amt paid crdtd. */
		private BigDecimal amtPaidCrdtd;

		/** The rate ddctn. */
		private BigDecimal rateDdctn;

		/** The form num. */
		private String formNum;

		/** The insert tmstmp. */
		private Date insertTmstmp;

		/** The update tmstmp. */
		private Date updateTmstmp;

		/** The tot tax deducted. */
		private BigDecimal totTaxDeducted;

		/** The tot inc tax dpstd colltd. */
		private BigDecimal totIncTaxDpstdColltd;

		/** The unq idnfctn no. */
		private String unqIdnfctnNo;

		/** The matching flg. */
		private String matchingFlg;

		/** The retn quarter. */
		private Character retnQuarter;

		/** The certificate num. */
		private String certificateNum;

		/** The db user. */
		private String dbUser;

		/** The batch type. */
		private String batchType;

		/** The rrr num. */
		private String rrrNum;

		/** The a 15 gh flg. */
		private Character a15ghFlg;

		/** The correction id. */
		private BigInteger correctionId;

		/** The cin num. */
		private String cinNum;

		/** The fas insert flag. */
		private String fasInsertFlag;

		/** The receipt staging ctrl id. */
		private BigInteger receiptStagingCtrlId;

		/** The rcc fas sla date. */
		private Date rccFasSlaDate;

		/** The error flag. */
		private Character errorFlag;

		/** The remarks. */
		private String remarks;

		/** The tds inwarding flag. */
		private String tdsInwardingFlag;

		/**
		 * Gets the tds 26 as out id.
		 *
		 * @return the tds 26 as out id
		 */
		@Id
		@Column(name = "TDS_26AS_OUT_ID", unique = true, nullable = false, precision = 31, scale = 0)
		public Long getTds26asOutId() {
			return this.tds26asOutId;
		}

		/**
		 * Sets the tds 26 as out id.
		 *
		 * @param tds26asOutId the new tds 26 as out id
		 */
		public void setTds26asOutId(Long tds26asOutId) {
			this.tds26asOutId = tds26asOutId;
		}

		/**
		 * Gets the batch id.
		 *
		 * @return the batch id
		 */
		@Column(name = "BATCH_ID", nullable = false, precision = 20, scale = 0)
		public BigInteger getBatchId() {
			return this.batchId;
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
		 * Gets the dd status.
		 *
		 * @return the dd status
		 */
		@Column(name = "DD_STATUS", nullable = false, length = 1)
		public char getDdStatus() {
			return this.ddStatus;
		}

		/**
		 * Sets the dd status.
		 *
		 * @param ddStatus the new dd status
		 */
		public void setDdStatus(char ddStatus) {
			this.ddStatus = ddStatus;
		}

		/**
		 * Gets the assess year.
		 *
		 * @return the assess year
		 */
		@Column(name = "ASSESS_YEAR", nullable = false, precision = 4, scale = 0)
		public short getAssessYear() {
			return this.assessYear;
		}

		/**
		 * Sets the assess year.
		 *
		 * @param assessYear the new assess year
		 */
		public void setAssessYear(short assessYear) {
			this.assessYear = assessYear;
		}

		/**
		 * Gets the ded pan.
		 *
		 * @return the ded pan
		 */
		@Column(name = "DED_PAN", nullable = false, length = 10)
		public String getDedPan() {
			return this.dedPan;
		}

		/**
		 * Sets the ded pan.
		 *
		 * @param dedPan the new ded pan
		 */
		public void setDedPan(String dedPan) {
			this.dedPan = dedPan;
		}

		/**
		 * Gets the ded tan.
		 *
		 * @return the ded tan
		 */
		@Column(name = "DED_TAN", nullable = false, length = 10)
		public String getDedTan() {
			return this.dedTan;
		}

		/**
		 * Sets the ded tan.
		 *
		 * @param dedTan the new ded tan
		 */
		public void setDedTan(String dedTan) {
			this.dedTan = dedTan;
		}

		/**
		 * Gets the sec code.
		 *
		 * @return the sec code
		 */
		@Column(name = "SEC_CODE", nullable = false, length = 3)
		public String getSecCode() {
			return this.secCode;
		}

		/**
		 * Sets the sec code.
		 *
		 * @param secCode the new sec code
		 */
		public void setSecCode(String secCode) {
			this.secCode = secCode;
		}

		/**
		 * Gets the dt pmnt crdt.
		 *
		 * @return the dt pmnt crdt
		 */
		@Temporal(TemporalType.DATE)
		@Column(name = "DT_PMNT_CRDT", nullable = false, length = 7)
		public Date getDtPmntCrdt() {
			return this.dtPmntCrdt;
		}

		/**
		 * Sets the dt pmnt crdt.
		 *
		 * @param dtPmntCrdt the new dt pmnt crdt
		 */
		public void setDtPmntCrdt(Date dtPmntCrdt) {
			this.dtPmntCrdt = dtPmntCrdt;
		}

		/**
		 * Gets the amt paid crdtd.
		 *
		 * @return the amt paid crdtd
		 */
		@Column(name = "AMT_PAID_CRDTD", nullable = false, precision = 16, scale = 3)
		public BigDecimal getAmtPaidCrdtd() {
			return this.amtPaidCrdtd;
		}

		/**
		 * Sets the amt paid crdtd.
		 *
		 * @param amtPaidCrdtd the new amt paid crdtd
		 */
		public void setAmtPaidCrdtd(BigDecimal amtPaidCrdtd) {
			this.amtPaidCrdtd = amtPaidCrdtd;
		}

		/**
		 * Gets the rate ddctn.
		 *
		 * @return the rate ddctn
		 */
		@Column(name = "RATE_DDCTN", precision = 7, scale = 3)
		public BigDecimal getRateDdctn() {
			return this.rateDdctn;
		}

		/**
		 * Sets the rate ddctn.
		 *
		 * @param rateDdctn the new rate ddctn
		 */
		public void setRateDdctn(BigDecimal rateDdctn) {
			this.rateDdctn = rateDdctn;
		}

		/**
		 * Gets the form num.
		 *
		 * @return the form num
		 */
		@Column(name = "FORM_NUM", nullable = false, length = 4)
		public String getFormNum() {
			return this.formNum;
		}

		/**
		 * Sets the form num.
		 *
		 * @param formNum the new form num
		 */
		public void setFormNum(String formNum) {
			this.formNum = formNum;
		}

		/**
		 * Gets the insert tmstmp.
		 *
		 * @return the insert tmstmp
		 */
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "INSERT_TMSTMP", nullable = false, length = 11)
		public Date getInsertTmstmp() {
			return this.insertTmstmp;
		}

		/**
		 * Sets the insert tmstmp.
		 *
		 * @param insertTmstmp the new insert tmstmp
		 */
		public void setInsertTmstmp(Date insertTmstmp) {
			this.insertTmstmp = insertTmstmp;
		}

		/**
		 * Gets the update tmstmp.
		 *
		 * @return the update tmstmp
		 */
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "UPDATE_TMSTMP", nullable = false, length = 11)
		public Date getUpdateTmstmp() {
			return this.updateTmstmp;
		}

		/**
		 * Sets the update tmstmp.
		 *
		 * @param updateTmstmp the new update tmstmp
		 */
		public void setUpdateTmstmp(Date updateTmstmp) {
			this.updateTmstmp = updateTmstmp;
		}

		/**
		 * Gets the tot tax deducted.
		 *
		 * @return the tot tax deducted
		 */
		@Column(name = "TOT_TAX_DEDUCTED", nullable = false, precision = 17, scale = 3)
		public BigDecimal getTotTaxDeducted() {
			return this.totTaxDeducted;
		}

		/**
		 * Sets the tot tax deducted.
		 *
		 * @param totTaxDeducted the new tot tax deducted
		 */
		public void setTotTaxDeducted(BigDecimal totTaxDeducted) {
			this.totTaxDeducted = totTaxDeducted;
		}

		/**
		 * Gets the tot inc tax dpstd colltd.
		 *
		 * @return the tot inc tax dpstd colltd
		 */
		@Column(name = "TOT_INC_TAX_DPSTD_COLLTD", nullable = false, precision = 17, scale = 3)
		public BigDecimal getTotIncTaxDpstdColltd() {
			return this.totIncTaxDpstdColltd;
		}

		/**
		 * Sets the tot inc tax dpstd colltd.
		 *
		 * @param totIncTaxDpstdColltd the new tot inc tax dpstd colltd
		 */
		public void setTotIncTaxDpstdColltd(BigDecimal totIncTaxDpstdColltd) {
			this.totIncTaxDpstdColltd = totIncTaxDpstdColltd;
		}

		/**
		 * Gets the unq idnfctn no.
		 *
		 * @return the unq idnfctn no
		 */
		@Column(name = "UNQ_IDNFCTN_NO", nullable = false, length = 16)
		public String getUnqIdnfctnNo() {
			return this.unqIdnfctnNo;
		}

		/**
		 * Sets the unq idnfctn no.
		 *
		 * @param unqIdnfctnNo the new unq idnfctn no
		 */
		public void setUnqIdnfctnNo(String unqIdnfctnNo) {
			this.unqIdnfctnNo = unqIdnfctnNo;
		}

		/**
		 * Gets the matching flg.
		 *
		 * @return the matching flg
		 */
		@Column(name = "MATCHING_FLG", nullable = false, length = 2)
		public String getMatchingFlg() {
			return this.matchingFlg;
		}

		/**
		 * Sets the matching flg.
		 *
		 * @param matchingFlg the new matching flg
		 */
		public void setMatchingFlg(String matchingFlg) {
			this.matchingFlg = matchingFlg;
		}

		/**
		 * Gets the retn quarter.
		 *
		 * @return the retn quarter
		 */
		@Column(name = "RETN_QUARTER", length = 2)
		public Character getRetnQuarter() {
			return this.retnQuarter;
		}

		/**
		 * Sets the retn quarter.
		 *
		 * @param retnQuarter the new retn quarter
		 */
		public void setRetnQuarter(Character retnQuarter) {
			this.retnQuarter = retnQuarter;
		}

		/**
		 * Gets the certificate num.
		 *
		 * @return the certificate num
		 */
		@Column(name = "CERTIFICATE_NUM", nullable = false, length = 7)
		public String getCertificateNum() {
			return this.certificateNum;
		}

		/**
		 * Sets the certificate num.
		 *
		 * @param certificateNum the new certificate num
		 */
		public void setCertificateNum(String certificateNum) {
			this.certificateNum = certificateNum;
		}

		/**
		 * Gets the db user.
		 *
		 * @return the db user
		 */
		@Column(name = "DB_USER", nullable = false, length = 10)
		public String getDbUser() {
			return this.dbUser;
		}

		/**
		 * Sets the db user.
		 *
		 * @param dbUser the new db user
		 */
		public void setDbUser(String dbUser) {
			this.dbUser = dbUser;
		}

		/**
		 * Gets the batch type.
		 *
		 * @return the batch type
		 */
		@Column(name = "BATCH_TYPE", nullable = false, length = 10)
		public String getBatchType() {
			return this.batchType;
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
		 * Gets the rrr num.
		 *
		 * @return the rrr num
		 */
		@Column(name = "RRR_NUM", length = 15)
		public String getRrrNum() {
			return this.rrrNum;
		}

		/**
		 * Sets the rrr num.
		 *
		 * @param rrrNum the new rrr num
		 */
		public void setRrrNum(String rrrNum) {
			this.rrrNum = rrrNum;
		}

		/**
		 * Gets the a 15 gh flg.
		 *
		 * @return the a 15 gh flg
		 */
		@Column(name = "A_15GH_FLG", length = 1)
		public Character getA15ghFlg() {
			return this.a15ghFlg;
		}

		/**
		 * Sets the a 15 gh flg.
		 *
		 * @param a15ghFlg the new a 15 gh flg
		 */
		public void setA15ghFlg(Character a15ghFlg) {
			this.a15ghFlg = a15ghFlg;
		}

		/**
		 * Gets the correction id.
		 *
		 * @return the correction id
		 */
		@Column(name = "CORRECTION_ID", precision = 20, scale = 0)
		public BigInteger getCorrectionId() {
			return this.correctionId;
		}

		/**
		 * Sets the correction id.
		 *
		 * @param correctionId the new correction id
		 */
		public void setCorrectionId(BigInteger correctionId) {
			this.correctionId = correctionId;
		}

		/**
		 * Gets the cin num.
		 *
		 * @return the cin num
		 */
		@Column(name = "CIN_NUM", length = 30)
		public String getCinNum() {
			return this.cinNum;
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
		 * Gets the fas insert flag.
		 *
		 * @return the fas insert flag
		 */
		@Column(name = "FAS_INSERT_FLAG", length = 1)
		public String getFasInsertFlag() {
			return this.fasInsertFlag;
		}

		/**
		 * Sets the fas insert flag.
		 *
		 * @param fasInsertFlag the new fas insert flag
		 */
		public void setFasInsertFlag(String fasInsertFlag) {
			this.fasInsertFlag = fasInsertFlag;
		}

		/**
		 * Gets the receipt staging ctrl id.
		 *
		 * @return the receipt staging ctrl id
		 */
		@Column(name = "RECEIPT_STAGING_CTRL_ID", precision = 22, scale = 0)
		public BigInteger getReceiptStagingCtrlId() {
			return this.receiptStagingCtrlId;
		}

		/**
		 * Sets the receipt staging ctrl id.
		 *
		 * @param receiptStagingCtrlId the new receipt staging ctrl id
		 */
		public void setReceiptStagingCtrlId(BigInteger receiptStagingCtrlId) {
			this.receiptStagingCtrlId = receiptStagingCtrlId;
		}

		/**
		 * Gets the rcc fas sla date.
		 *
		 * @return the rcc fas sla date
		 */
		@Temporal(TemporalType.DATE)
		@Column(name = "RCC_FAS_SLA_DATE", length = 7)
		public Date getRccFasSlaDate() {
			return this.rccFasSlaDate;
		}

		/**
		 * Sets the rcc fas sla date.
		 *
		 * @param rccFasSlaDate the new rcc fas sla date
		 */
		public void setRccFasSlaDate(Date rccFasSlaDate) {
			this.rccFasSlaDate = rccFasSlaDate;
		}

		/**
		 * Gets the error flag.
		 *
		 * @return the error flag
		 */
		@Column(name = "ERROR_FLAG", length = 1)
		public Character getErrorFlag() {
			return this.errorFlag;
		}

		/**
		 * Sets the error flag.
		 *
		 * @param errorFlag the new error flag
		 */
		public void setErrorFlag(Character errorFlag) {
			this.errorFlag = errorFlag;
		}

		/**
		 * Gets the remarks.
		 *
		 * @return the remarks
		 */
		@Column(name = "REMARKS", length = 3000)
		public String getRemarks() {
			return this.remarks;
		}

		/**
		 * Sets the remarks.
		 *
		 * @param remarks the new remarks
		 */
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		/**
		 * Gets the tds inwarding flag.
		 *
		 * @return the tds inwarding flag
		 */
		@Column(name = "TDS_INWARDING_FLAG", nullable = false, length = 2)
		public String getTdsInwardingFlag() {
			return this.tdsInwardingFlag;
		}

		/**
		 * Sets the tds inwarding flag.
		 *
		 * @param tdsInwardingFlag the new tds inwarding flag
		 */
		public void setTdsInwardingFlag(String tdsInwardingFlag) {
			this.tdsInwardingFlag = tdsInwardingFlag;
		}

		/**
		 * To string.
		 *
		 * @author aruna02
		 * @version 1.0
		 * @return the string
		 * @since Sep 24, 2020
		 */
		@Override
		public String toString() {
			return "Tds26asOutbndStg [tds26asOutId=" + tds26asOutId + ", batchId=" + batchId + ", ddStatus=" + ddStatus
					+ ", assessYear=" + assessYear + ", dedPan=" + dedPan + ", dedTan=" + dedTan + ", secCode=" + secCode
					+ ", dtPmntCrdt=" + dtPmntCrdt + ", amtPaidCrdtd=" + amtPaidCrdtd + ", rateDdctn=" + rateDdctn
					+ ", formNum=" + formNum + ", insertTmstmp=" + insertTmstmp + ", updateTmstmp=" + updateTmstmp
					+ ", totTaxDeducted=" + totTaxDeducted + ", totIncTaxDpstdColltd=" + totIncTaxDpstdColltd
					+ ", unqIdnfctnNo=" + unqIdnfctnNo + ", matchingFlg=" + matchingFlg + ", retnQuarter=" + retnQuarter
					+ ", certificateNum=" + certificateNum + ", dbUser=" + dbUser + ", batchType=" + batchType + ", rrrNum="
					+ rrrNum + ", a15ghFlg=" + a15ghFlg + ", correctionId=" + correctionId + ", cinNum=" + cinNum
					+ ", fasInsertFlag=" + fasInsertFlag + ", receiptStagingCtrlId=" + receiptStagingCtrlId
					+ ", rccFasSlaDate=" + rccFasSlaDate + ", errorFlag=" + errorFlag + ", remarks=" + remarks
					+ ", tdsInwardingFlag=" + tdsInwardingFlag + ", getTds26asOutId()=" + getTds26asOutId()
					+ ", getBatchId()=" + getBatchId() + ", getDdStatus()=" + getDdStatus() + ", getAssessYear()="
					+ getAssessYear() + ", getDedPan()=" + getDedPan() + ", getDedTan()=" + getDedTan() + ", getSecCode()="
					+ getSecCode() + ", getDtPmntCrdt()=" + getDtPmntCrdt() + ", getAmtPaidCrdtd()=" + getAmtPaidCrdtd()
					+ ", getRateDdctn()=" + getRateDdctn() + ", getFormNum()=" + getFormNum() + ", getInsertTmstmp()="
					+ getInsertTmstmp() + ", getUpdateTmstmp()=" + getUpdateTmstmp() + ", getTotTaxDeducted()="
					+ getTotTaxDeducted() + ", getTotIncTaxDpstdColltd()=" + getTotIncTaxDpstdColltd()
					+ ", getUnqIdnfctnNo()=" + getUnqIdnfctnNo() + ", getMatchingFlg()=" + getMatchingFlg()
					+ ", getRetnQuarter()=" + getRetnQuarter() + ", getCertificateNum()=" + getCertificateNum()
					+ ", getDbUser()=" + getDbUser() + ", getBatchType()=" + getBatchType() + ", getRrrNum()=" + getRrrNum()
					+ ", getA15ghFlg()=" + getA15ghFlg() + ", getCorrectionId()=" + getCorrectionId() + ", getCinNum()="
					+ getCinNum() + ", getFasInsertFlag()=" + getFasInsertFlag() + ", getReceiptStagingCtrlId()="
					+ getReceiptStagingCtrlId() + ", getRccFasSlaDate()=" + getRccFasSlaDate() + ", getErrorFlag()="
					+ getErrorFlag() + ", getRemarks()=" + getRemarks() + ", getTdsInwardingFlag()=" + getTdsInwardingFlag()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

	}


