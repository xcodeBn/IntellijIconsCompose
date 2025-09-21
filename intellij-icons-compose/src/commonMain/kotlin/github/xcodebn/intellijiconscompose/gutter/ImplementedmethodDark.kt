package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImplementedmethodDark: ImageVector
    get() {
        if (_ImplementedmethodDark != null) return _ImplementedmethodDark!!

        _ImplementedmethodDark = ImageVector.Builder(
            name = "ImplementedmethodDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 9f)
                lineTo(12f, 9f)
                lineTo(10f, 12f)
                lineTo(7f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(4f, 5f)
                lineTo(4f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 8f)
                lineTo(2f, 8f)
                lineTo(2f, 7f)
                lineTo(3f, 7f)
                lineTo(3f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 5f)
                lineTo(4f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(10f, 9f)
                    lineTo(12f, 9f)
                    lineTo(10f, 12f)
                    lineTo(7f, 9f)
                    lineTo(9f, 9f)
                    lineTo(9f, 0f)
                    lineTo(10f, 0f)
                    lineTo(10f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(4f, 5f)
                    lineTo(4f, 7f)
                    lineTo(5f, 7f)
                    lineTo(5f, 8f)
                    lineTo(2f, 8f)
                    lineTo(2f, 7f)
                    lineTo(3f, 7f)
                    lineTo(3f, 5f)
                    lineTo(2f, 5f)
                    lineTo(2f, 4f)
                    lineTo(5f, 4f)
                    lineTo(5f, 5f)
                    lineTo(4f, 5f)
                    close()
                }
            }
        }.build()

        return _ImplementedmethodDark!!
    }

private var _ImplementedmethodDark: ImageVector? = null

