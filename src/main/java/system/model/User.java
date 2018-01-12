package system.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Getter
@Setter
public class User {

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    private String name;
    private String password;

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("name", name)
                .append("password", password)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(name, user.name)
                .append(password, user.password)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(password)
                .toHashCode();
    }
}
