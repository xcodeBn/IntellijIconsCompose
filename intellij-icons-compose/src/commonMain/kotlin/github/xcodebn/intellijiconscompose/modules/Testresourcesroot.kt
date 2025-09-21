package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testresourcesroot: ImageVector
    get() {
        if (_Testresourcesroot != null) return _Testresourcesroot!!

        _Testresourcesroot = ImageVector.Builder(
            name = "Testresourcesroot",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(9f, 12f)
                lineTo(6f, 8f)
                lineTo(4f, 8f)
                lineTo(1f, 10f)
                lineTo(1f, 2f)
                curveTo(1.00f, 2.04f, 1.01f, 2.02f, 1.02f, 2.02f)
                curveTo(1.02f, 2.01f, 1.04f, 2.00f, 1.05f, 2.00f)
                lineTo(5f, 2f)
                curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                lineTo(8f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 8f)
                lineTo(9f, 8f)
                lineTo(9f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(7f, 2f)
                lineTo(10f, 5f)
                lineTo(3f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(2f, 2f)
                lineTo(6f, 5f)
                lineTo(-1f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(9f, 12f)
                    lineTo(6f, 8f)
                    lineTo(4f, 8f)
                    lineTo(1f, 10f)
                    lineTo(1f, 2f)
                    curveTo(1.00f, 2.04f, 1.01f, 2.02f, 1.02f, 2.02f)
                    curveTo(1.02f, 2.01f, 1.04f, 2.00f, 1.05f, 2.00f)
                    lineTo(5f, 2f)
                    curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                    lineTo(8f, 4f)
                    lineTo(15f, 4f)
                    lineTo(15f, 8f)
                    lineTo(9f, 8f)
                    lineTo(9f, 12f)
                    close()
                }
            }
        }.build()

        return _Testresourcesroot!!
    }

private var _Testresourcesroot: ImageVector? = null

