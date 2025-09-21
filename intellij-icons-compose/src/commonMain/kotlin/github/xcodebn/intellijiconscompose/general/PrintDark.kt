package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PrintDark: ImageVector
    get() {
        if (_PrintDark != null) return _PrintDark!!

        _PrintDark = ImageVector.Builder(
            name = "PrintDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 6f)
                lineTo(14f, 6f)
                curveTo(14.48f, 6.00f, 15.00f, 6.45f, 15.00f, 7.00f)
                lineTo(15f, 11f)
                lineTo(1f, 11f)
                lineTo(1f, 7f)
                curveTo(1.00f, 6.45f, 1.52f, 6.00f, 2.17f, 6.00f)
                close()
                moveTo(13f, 7f)
                lineTo(13f, 8f)
                lineTo(14f, 8f)
                lineTo(14f, 7f)
                lineTo(13f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(4f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 15f)
                lineTo(4f, 15f)
                lineTo(4f, 9f)
                close()
                moveTo(5f, 10f)
                lineTo(5f, 14f)
                lineTo(11f, 14f)
                lineTo(11f, 10f)
                lineTo(5f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(2f, 6f)
                    lineTo(14f, 6f)
                    curveTo(14.48f, 6.00f, 15.00f, 6.45f, 15.00f, 7.00f)
                    lineTo(15f, 11f)
                    lineTo(1f, 11f)
                    lineTo(1f, 7f)
                    curveTo(1.00f, 6.45f, 1.52f, 6.00f, 2.17f, 6.00f)
                    close()
                    moveTo(13f, 7f)
                    lineTo(13f, 8f)
                    lineTo(14f, 8f)
                    lineTo(14f, 7f)
                    lineTo(13f, 7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(4f, 9f)
                    lineTo(12f, 9f)
                    lineTo(12f, 15f)
                    lineTo(4f, 15f)
                    lineTo(4f, 9f)
                    close()
                    moveTo(5f, 10f)
                    lineTo(5f, 14f)
                    lineTo(11f, 14f)
                    lineTo(11f, 10f)
                    lineTo(5f, 10f)
                    close()
                }
            }
        }.build()

        return _PrintDark!!
    }

private var _PrintDark: ImageVector? = null

