package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wsdlfile: ImageVector
    get() {
        if (_Wsdlfile != null) return _Wsdlfile!!

        _Wsdlfile = ImageVector.Builder(
            name = "Wsdlfile",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(1f, 1f)
                lineTo(1f, 4f)
                lineTo(2f, 4f)
                curveTo(2.58f, 4.00f, 3.00f, 3.49f, 3.00f, 2.52f)
                lineTo(3f, 2f)
                curveTo(3.00f, 1.52f, 2.58f, 1.00f, 1.65f, 1.00f)
                lineTo(1f, 1f)
                close()
                moveTo(0f, 0f)
                lineTo(2f, 0f)
                curveTo(3.04f, 0.00f, 4.00f, 1.09f, 4.00f, 2.50f)
                curveTo(4.00f, 3.92f, 3.04f, 5.00f, 1.65f, 5.00f)
                lineTo(0f, 5f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(1f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 9f)
                lineTo(1f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 8f)
                lineTo(13f, 8f)
                lineTo(13f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(0f, 0f)
                lineTo(1f, 0f)
                lineTo(1f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 5f)
                lineTo(0f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(1f, 1f)
                    lineTo(1f, 4f)
                    lineTo(2f, 4f)
                    curveTo(2.58f, 4.00f, 3.00f, 3.49f, 3.00f, 2.52f)
                    lineTo(3f, 2f)
                    curveTo(3.00f, 1.52f, 2.58f, 1.00f, 1.65f, 1.00f)
                    lineTo(1f, 1f)
                    close()
                    moveTo(0f, 0f)
                    lineTo(2f, 0f)
                    curveTo(3.04f, 0.00f, 4.00f, 1.09f, 4.00f, 2.50f)
                    curveTo(4.00f, 3.92f, 3.04f, 5.00f, 1.65f, 5.00f)
                    lineTo(0f, 5f)
                    lineTo(0f, 0f)
                    close()
                }
            }
        }.build()

        return _Wsdlfile!!
    }

private var _Wsdlfile: ImageVector? = null

