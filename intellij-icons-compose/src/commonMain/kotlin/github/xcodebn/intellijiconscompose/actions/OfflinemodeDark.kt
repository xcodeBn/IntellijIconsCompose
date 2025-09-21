package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val OfflinemodeDark: ImageVector
    get() {
        if (_OfflinemodeDark != null) return _OfflinemodeDark!!

        _OfflinemodeDark = ImageVector.Builder(
            name = "OfflinemodeDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(6f, 6f)
                lineTo(5f, 10f)
                lineTo(1f, 10f)
                lineTo(1f, 6f)
                lineTo(6f, 6f)
                close()
                moveTo(11f, 6f)
                lineTo(15f, 6f)
                lineTo(15f, 10f)
                lineTo(10f, 10f)
                lineTo(11f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 1f)
                lineTo(12f, 1f)
                lineTo(9f, 15f)
                lineTo(8f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(7f, 1f)
                lineTo(8f, 1f)
                lineTo(6f, 15f)
                lineTo(4f, 15f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(6f, 6f)
                    lineTo(5f, 10f)
                    lineTo(1f, 10f)
                    lineTo(1f, 6f)
                    lineTo(6f, 6f)
                    close()
                    moveTo(11f, 6f)
                    lineTo(15f, 6f)
                    lineTo(15f, 10f)
                    lineTo(10f, 10f)
                    lineTo(11f, 6f)
                    close()
                }
            }
        }.build()

        return _OfflinemodeDark!!
    }

private var _OfflinemodeDark: ImageVector? = null

