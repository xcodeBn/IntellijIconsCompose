package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Padlock: ImageVector
    get() {
        if (_Padlock != null) return _Padlock!!

        _Padlock = ImageVector.Builder(
            name = "Padlock",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 3f)
                curveTo(7.04f, 2.07f, 6.01f, 0.81f, 4.60f, 0.68f)
                curveTo(2.98f, 0.53f, 1.62f, 1.79f, 1.62f, 3.37f)
                lineTo(2f, 5f)
                lineTo(0f, 5f)
                lineTo(0f, 12f)
                lineTo(8f, 12f)
                lineTo(8f, 5f)
                close()
                moveTo(3f, 5f)
                lineTo(3f, 3f)
                curveTo(2.71f, 2.48f, 3.43f, 1.75f, 4.33f, 1.75f)
                curveTo(5.23f, 1.75f, 5.96f, 2.48f, 5.96f, 3.37f)
                lineTo(6f, 5f)
                lineTo(3f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 16f)
                lineTo(0f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 16f)
                lineTo(0f, 16f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8f, 5f)
                    lineTo(7f, 5f)
                    lineTo(7f, 3f)
                    curveTo(7.04f, 2.07f, 6.01f, 0.81f, 4.60f, 0.68f)
                    curveTo(2.98f, 0.53f, 1.62f, 1.79f, 1.62f, 3.37f)
                    lineTo(2f, 5f)
                    lineTo(0f, 5f)
                    lineTo(0f, 12f)
                    lineTo(8f, 12f)
                    lineTo(8f, 5f)
                    close()
                    moveTo(3f, 5f)
                    lineTo(3f, 3f)
                    curveTo(2.71f, 2.48f, 3.43f, 1.75f, 4.33f, 1.75f)
                    curveTo(5.23f, 1.75f, 5.96f, 2.48f, 5.96f, 3.37f)
                    lineTo(6f, 5f)
                    lineTo(3f, 5f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8f, 5f)
                    lineTo(7f, 5f)
                    lineTo(7f, 3f)
                    curveTo(7.04f, 2.07f, 6.01f, 0.81f, 4.60f, 0.68f)
                    curveTo(2.98f, 0.53f, 1.62f, 1.79f, 1.62f, 3.37f)
                    lineTo(2f, 5f)
                    lineTo(0f, 5f)
                    lineTo(0f, 12f)
                    lineTo(8f, 12f)
                    lineTo(8f, 5f)
                    close()
                    moveTo(3f, 5f)
                    lineTo(3f, 3f)
                    curveTo(2.71f, 2.48f, 3.43f, 1.75f, 4.33f, 1.75f)
                    curveTo(5.23f, 1.75f, 5.96f, 2.48f, 5.96f, 3.37f)
                    lineTo(6f, 5f)
                    lineTo(3f, 5f)
                    close()
                }
            }
        }.build()

        return _Padlock!!
    }

private var _Padlock: ImageVector? = null

