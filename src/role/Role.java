/*
 * Role.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package role;
/**
 *
 */
public abstract class Role {
	private float posX;
	private float posY;
	private boolean available = true;
	private byte lifes = 3;
	private float energy = 100;
	
	public Role(float posX, float posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public abstract void move();
	public abstract void jump();

	/**
	 * Gets the value of posX.
	 *
	 * @return the posX
	 */
	public float getPosX() {
		return posX;
	}

	/**
	 * Sets the value of posX.
	 *
	 * @param posX the posX to set
	 */
	public void setPosX(float posX) {
		this.posX = posX;
	}

	/**
	 * Gets the value of posY.
	 *
	 * @return the posY
	 */
	public float getPosY() {
		return posY;
	}

	/**
	 * Sets the value of posY.
	 *
	 * @param posY the posY to set
	 */
	public void setPosY(float posY) {
		this.posY = posY;
	}

	/**
	 * Gets the value of available.
	 *
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * Sets the value of available.
	 *
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * Gets the value of lifes.
	 *
	 * @return the lifes
	 */
	public byte getLifes() {
		return lifes;
	}

	/**
	 * Sets the value of lifes.
	 *
	 * @param lifes the lifes to set
	 */
	public void setLifes(byte lifes) {
		this.lifes = lifes;
	}

	/**
	 * Gets the value of energy.
	 *
	 * @return the energy
	 */
	public float getEnergy() {
		return energy;
	}

	/**
	 * Sets the value of energy.
	 *
	 * @param energy the energy to set
	 */
	public void setEnergy(float energy) {
		this.energy = energy;
	}

	/**
	 * Returns a string representation of this object.
	 *
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "Role{posX=" + posX + ", posY=" + posY + ", available=" + available + ", lifes=" + lifes + ", energy=" + energy + "}";
	}

	public final void extraMove() {
		if(available && energy >= 2){
			posX += 20.5;
			energy -= 2;
		}
	}

	public final void extraJump() {
		if(available && energy >= 4){
			posX += 25.2;
			energy -= 4;
		}
	}

	public final void resetPosition() {
		setPosX(0);
		setPosY(0);
	}

	public final void resetRole() {
		setPosX(0);
		setPosY(0);
		setAvailable(true);
		setLifes(3);
		setEnergy(100);
	}

	public final boolean decreaseLife() {
		if(available && lifes >= 1 ){
			lifes--;
			return true;
		} else{
			return false;
		}
	}

	public final boolean increaseLife() {
		if(available && lifes < 3){
			lifes++;
			return true;
		} else{
			return false;
		}
	}
}

