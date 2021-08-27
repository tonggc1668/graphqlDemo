package com.example.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.entities.Pet;
import com.example.graphql.entities.PetInput;
import org.springframework.stereotype.Component;

@Component
public class PetMutation implements GraphQLMutationResolver {

    public Pet savePet(PetInput pet) {
        Pet p = new Pet();
        p.setId(3);
        p.setName(pet.getName());
        p.setAge(pet.getAge());
        p.setType(pet.getType());
        return p;
    }
}
