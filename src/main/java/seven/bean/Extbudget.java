package seven.bean;

public class Extbudget {

	/** Ԥ����� */
	private String AnnualBudget;
	/** Ԥ�㵥λ����; */
	private String BudgetUnitCode;
	/** ���ű���; */
	private String DepartmentCode;
	/** ��������; */
	private String DepartmentName;
	/** Ԥ���������; */
	private String BudgetItemCode;
	/** Ԥ����������; */
	private String BudgetItemName;
	/** Ԥ��ָ����Ŀ����; */
	private String BudgetIndicatorsName;
	/** Ԥ����Ԫ; */
	private String BudgetAmount;
	/** �ʽ���;; */
	private String CapitalUSES;

	public String getAnnualBudget() {
		return AnnualBudget;
	}

	public void setAnnualBudget(String annualBudget) {
		AnnualBudget = annualBudget;
	}

	public String getBudgetUnitCode() {
		return BudgetUnitCode;
	}

	public void setBudgetUnitCode(String budgetUnitCode) {
		BudgetUnitCode = budgetUnitCode;
	}

	public String getDepartmentCode() {
		return DepartmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		DepartmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getBudgetItemCode() {
		return BudgetItemCode;
	}

	public void setBudgetItemCode(String budgetItemCode) {
		BudgetItemCode = budgetItemCode;
	}

	public String getBudgetItemName() {
		return BudgetItemName;
	}

	public void setBudgetItemName(String budgetItemName) {
		BudgetItemName = budgetItemName;
	}

	public String getBudgetIndicatorsName() {
		return BudgetIndicatorsName;
	}

	public void setBudgetIndicatorsName(String budgetIndicatorsName) {
		BudgetIndicatorsName = budgetIndicatorsName;
	}

	public String getBudgetAmount() {
		return BudgetAmount;
	}

	public void setBudgetAmount(String budgetAmount) {
		BudgetAmount = budgetAmount;
	}

	public String getCapitalUSES() {
		return CapitalUSES;
	}

	public void setCapitalUSES(String capitalUSES) {
		CapitalUSES = capitalUSES;
	}

	@Override
	public String toString() {
		return "Extbudget [AnnualBudget=" + AnnualBudget + ", BudgetUnitCode=" + BudgetUnitCode + ", DepartmentCode="
				+ DepartmentCode + ", DepartmentName=" + DepartmentName + ", BudgetItemCode=" + BudgetItemCode
				+ ", BudgetItemName=" + BudgetItemName + ", BudgetIndicatorsName=" + BudgetIndicatorsName
				+ ", BudgetAmount=" + BudgetAmount + ", CapitalUSES=" + CapitalUSES + "]";
	}

	public boolean IsNull() {
		return AnnualBudget.trim().equals("") && BudgetUnitCode.trim().equals("") && DepartmentName.trim().equals("")
				&& DepartmentCode.trim().equals("") && BudgetItemCode.trim().equals("")
				&& BudgetItemCode.trim().equals("") && BudgetAmount.trim().equals("") && CapitalUSES.trim().equals("")
				&& BudgetIndicatorsName.trim().equals("");

	}

}
