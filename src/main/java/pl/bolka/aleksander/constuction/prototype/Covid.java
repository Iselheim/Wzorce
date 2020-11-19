package pl.bolka.aleksander.constuction.prototype;

public class Covid extends Virus {

  private boolean lockdown;

  public Covid(int power) {
    super(power);
  }

  public Covid(Covid virus) {
    super(virus);
    this.lockdown = virus.lockdown;
  }

  @Override
  public Virus clone() {
    return new Covid(this);
  }

  public boolean isLockdown() {
    return lockdown;
  }

  public void setLockdown(boolean lockdown) {
    this.lockdown = lockdown;
  }
}
