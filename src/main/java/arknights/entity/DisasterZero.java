package arknights.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;

import java.util.Random;

public class DisasterZero extends Entity {
    private static final DataParameter<Integer> TIME = EntityDataManager.createKey(DisasterZero.class, DataSerializers.VARINT);
    private int time = 500;
    public DisasterZero(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(p_i48580_1_, p_i48580_2_);
    }

    @Override
    public void tick(){
        if(this.time % 5 == 0){
            /*
            TNTEntity tntEntity = new TNTEntity(this.getEntityWorld(),
                    this.getPositionVec().x + (20 - new Random().nextInt(40)), this.getPositionVec().y, this.getPositionVec().z + (20 - new Random().nextInt(40)),
                    null);
            this.getEntityWorld().addEntity(tntEntity);
            */
            /*
            FireballEntity fireballEntity = new FireballEntity(this.getEntityWorld(),
                    this.getPositionVec().x + (100 - new Random().nextInt(200)), this.getPositionVec().y + 128, this.getPositionVec().z + (100 - new Random().nextInt(200)), 0, -500, 0){
                @Override
                protected IParticleData getParticle() {
                    return ParticleTypes.FLAME;
                }
            };
            */
            Meteorite fireballEntity = new Meteorite(this.getEntityWorld(),
                    this.getPositionVec().x + (100 - new Random().nextInt(200)), this.getPositionVec().y + 128, this.getPositionVec().z + (100 - new Random().nextInt(200)), 0, -500, 0);
            fireballEntity.explosionPower = 10;
            //fireballEntity.spawnRunningParticles();
            this.getEntityWorld().addEntity(fireballEntity);
        }
        if(this.time<=0){
            this.remove();
        }
        this.time--;
    }

    @Override
    protected void registerData() {
        //this.dataManager.register(TIME, 500);
    }

    @Override
    protected void readAdditional(CompoundNBT compound) {
        //this.time = compound.getInt("time");
    }

    @Override
    protected void writeAdditional(CompoundNBT compound) {
        //compound.putInt("time", time);
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return new SSpawnObjectPacket(this);
    }
}
