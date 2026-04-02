/*
 * Outlander.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package role;

public class Outlander extends Role {

    public Outlander(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void move() {
        if (isAvailable() && getEnergy() >= 0.5f) {
            setPosX(getPosX() + 8.5f);
            setEnergy(getEnergy() - 0.5f);
        }
    }

    @Override
    public void jump() {
        if (isAvailable() && getEnergy() >= 1.0f) {
            setPosY(getPosY() + 6.2f);
            setEnergy(getEnergy() - 1.0f);
        }
    }

    @Override
    public String toString() {
        return "Outlander -> " + super.toString();
    }
}

