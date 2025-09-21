package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unloadedmodule: ImageVector
    get() {
        if (_Unloadedmodule != null) return _Unloadedmodule!!

        _Unloadedmodule = ImageVector.Builder(
            name = "Unloadedmodule",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(12f, 13f)
                lineTo(9f, 13f)
                lineTo(9f, 9f)
                lineTo(15f, 9f)
                lineTo(15f, 13f)
                lineTo(12f, 13f)
                lineTo(1f, 13f)
                lineTo(1f, 2f)
                curveTo(1.00f, 2.02f, 1.02f, 2.00f, 1.05f, 2.00f)
                lineTo(5f, 2f)
                curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                lineTo(8f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 13f)
                lineTo(12f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFF26522))
                ) {
                    moveTo(12f, 13f)
                    lineTo(9f, 13f)
                    lineTo(9f, 9f)
                    lineTo(15f, 9f)
                    lineTo(15f, 13f)
                    lineTo(12f, 13f)
                    lineTo(1f, 13f)
                    lineTo(1f, 2f)
                    curveTo(1.00f, 2.02f, 1.02f, 2.00f, 1.05f, 2.00f)
                    lineTo(5f, 2f)
                    curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                    lineTo(8f, 4f)
                    lineTo(15f, 4f)
                    lineTo(15f, 13f)
                    lineTo(12f, 13f)
                    close()
                }
            }
        }.build()

        return _Unloadedmodule!!
    }

private var _Unloadedmodule: ImageVector? = null

