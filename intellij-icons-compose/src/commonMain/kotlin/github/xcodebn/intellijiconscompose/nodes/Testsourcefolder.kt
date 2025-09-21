package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testsourcefolder: ImageVector
    get() {
        if (_Testsourcefolder != null) return _Testsourcefolder!!

        _Testsourcefolder = ImageVector.Builder(
            name = "Testsourcefolder",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(15f, 11f)
                lineTo(12f, 8f)
                lineTo(10f, 8f)
                lineTo(6f, 12f)
                lineTo(7f, 13f)
                lineTo(1f, 13f)
                lineTo(1f, 2f)
                curveTo(1.00f, 2.02f, 1.02f, 2.00f, 1.05f, 2.00f)
                lineTo(5f, 2f)
                curveTo(5.53f, 2.00f, 6.30f, 2.32f, 6.70f, 2.71f)
                lineTo(8f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(14f, 11f)
                lineTo(17f, 14f)
                lineTo(10f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(9f, 11f)
                lineTo(13f, 14f)
                lineTo(6f, 14f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(15f, 11f)
                    lineTo(12f, 8f)
                    lineTo(10f, 8f)
                    lineTo(6f, 12f)
                    lineTo(7f, 13f)
                    lineTo(1f, 13f)
                    lineTo(1f, 2f)
                    curveTo(1.00f, 2.02f, 1.02f, 2.00f, 1.05f, 2.00f)
                    lineTo(5f, 2f)
                    curveTo(5.53f, 2.00f, 6.30f, 2.32f, 6.70f, 2.71f)
                    lineTo(8f, 4f)
                    lineTo(15f, 4f)
                    lineTo(15f, 11f)
                    close()
                }
            }
        }.build()

        return _Testsourcefolder!!
    }

private var _Testsourcefolder: ImageVector? = null

