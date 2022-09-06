public class Mage {
    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return String.format("%s, %d, %d, %s", name, level, damage, type);
    }

    public String fight(Mage mage){
        String winner = "";
        switch(type){
            case "fire":
                if (mage.type.equals("ice"))
                    winner = this.name;
                else if (mage.type.equals("earth"))
                    winner = mage.name;
                else{
                    if (this.level > mage.level)
                        winner = this.name;
                    else if (this.level < mage.level)
                        winner = mage.name;
                    else{
                        if(this.damage > mage.damage)
                            winner = this.name;
                        else if (this.damage < mage.damage)
                            winner = mage.name;
                        else
                            winner = "draw";
                    }
                }
                break;
            case "ice":
                if (mage.type.equals("earth"))
                    return this.name;
                else if (mage.type.equals("fire"))
                    return mage.name;
                else{
                    if (this.level > mage.level)
                        winner = this.name;
                    else if (this.level < mage.level)
                        winner = mage.name;
                    else{
                        if(this.damage > mage.damage)
                            winner = this.name;
                        else if (this.damage < mage.damage)
                            winner = mage.name;
                        else
                            winner = "draw";
                    }
                }
                break;
            case "earth":
                if (mage.type.equals("fire"))
                    return this.name;
                else if (mage.type.equals("ice"))
                    return mage.name;
                else{
                    if (this.level > mage.level)
                        winner = this.name;
                    else if (this.level < mage.level)
                        winner = mage.name;
                    else{
                        if(this.damage > mage.damage)
                            winner = this.name;
                        else if (this.damage < mage.damage)
                            winner = mage.name;
                        else
                            winner = "draw";
                    }
                }
                break;
        }
        return winner;
    }
}
