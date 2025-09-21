package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShowreadaccessDark: ImageVector
    get() {
        if (_ShowreadaccessDark != null) return _ShowreadaccessDark!!

        _ShowreadaccessDark = ImageVector.Builder(
            name = "ShowreadaccessDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(6f, 10f)
                lineTo(8f, 10f)
                lineTo(9f, 12f)
                lineTo(12f, 8f)
                lineTo(9f, 4f)
                lineTo(8f, 6f)
                lineTo(6f, 6f)
                lineTo(10f, 2f)
                lineTo(15f, 8f)
                lineTo(10f, 14f)
                lineTo(6f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(5f, 8f)
                lineTo(8f, 8f)
                lineTo(4f, 12f)
                lineTo(1f, 8f)
                lineTo(3f, 8f)
                lineTo(3f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF499C54))
                ) {
                    moveTo(6f, 10f)
                    lineTo(8f, 10f)
                    lineTo(9f, 12f)
                    lineTo(12f, 8f)
                    lineTo(9f, 4f)
                    lineTo(8f, 6f)
                    lineTo(6f, 6f)
                    lineTo(10f, 2f)
                    lineTo(15f, 8f)
                    lineTo(10f, 14f)
                    lineTo(6f, 10f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(5f, 8f)
                    lineTo(8f, 8f)
                    lineTo(4f, 12f)
                    lineTo(1f, 8f)
                    lineTo(3f, 8f)
                    lineTo(3f, 4f)
                    lineTo(5f, 4f)
                    lineTo(5f, 8f)
                    close()
                }
            }
        }.build()

        return _ShowreadaccessDark!!
    }

private var _ShowreadaccessDark: ImageVector? = null

