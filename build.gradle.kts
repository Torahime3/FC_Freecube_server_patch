plugins {
  id("mod.base-conventions")
}

dependencies {
  compileOnly(libs.ignite)
  compileOnly(libs.mixin)

  paperweight.paperDevBundle("1.20.2-R0.1-SNAPSHOT")
}
