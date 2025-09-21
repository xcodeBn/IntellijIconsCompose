package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Resourcesroot: ImageVector
    get() {
        if (_Resourcesroot != null) return _Resourcesroot!!

        _Resourcesroot = ImageVector.Builder(
            name = "Resourcesroot",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 4f)
                lineTo(7f, 3f)
                curveTo(6.22f, 2.29f, 5.62f, 2.03f, 4.98f, 2.00f)
                lineTo(1f, 2f)
                curveTo(1.04f, 2.00f, 1.02f, 2.01f, 1.02f, 2.02f)
                curveTo(1.01f, 2.02f, 1.00f, 2.04f, 1.00f, 2.05f)
                lineTo(1f, 13f)
                lineTo(9f, 13f)
                lineTo(9f, 8f)
                lineTo(15f, 8f)
                lineTo(15f, 4f)
                lineTo(8f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(8f, 4f)
                    lineTo(7f, 3f)
                    curveTo(6.22f, 2.29f, 5.62f, 2.03f, 4.98f, 2.00f)
                    lineTo(1f, 2f)
                    curveTo(1.04f, 2.00f, 1.02f, 2.01f, 1.02f, 2.02f)
                    curveTo(1.01f, 2.02f, 1.00f, 2.04f, 1.00f, 2.05f)
                    lineTo(1f, 13f)
                    lineTo(9f, 13f)
                    lineTo(9f, 8f)
                    lineTo(15f, 8f)
                    lineTo(15f, 4f)
                    lineTo(8f, 4f)
                    close()
                }
            }
        }.build()

        return _Resourcesroot!!
    }

private var _Resourcesroot: ImageVector? = null

