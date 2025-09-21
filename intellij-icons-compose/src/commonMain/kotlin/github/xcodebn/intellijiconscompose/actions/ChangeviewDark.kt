package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChangeviewDark: ImageVector
    get() {
        if (_ChangeviewDark != null) return _ChangeviewDark!!

        _ChangeviewDark = ImageVector.Builder(
            name = "ChangeviewDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 10f)
                lineTo(7f, 12f)
                lineTo(8f, 13f)
                lineTo(11f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 10f)
                lineTo(8f, 7f)
                lineTo(7f, 9f)
                lineTo(9f, 10f)
                close()
                moveTo(5f, 6f)
                lineTo(15f, 6f)
                lineTo(15f, 15f)
                lineTo(5f, 15f)
                lineTo(5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(11f, 5f)
                lineTo(4f, 5f)
                lineTo(4f, 11f)
                lineTo(1f, 11f)
                lineTo(1f, 2f)
                lineTo(11f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(9f, 10f)
                    lineTo(7f, 12f)
                    lineTo(8f, 13f)
                    lineTo(11f, 10f)
                    lineTo(11f, 10f)
                    lineTo(11f, 10f)
                    lineTo(8f, 7f)
                    lineTo(7f, 9f)
                    lineTo(9f, 10f)
                    close()
                    moveTo(5f, 6f)
                    lineTo(15f, 6f)
                    lineTo(15f, 15f)
                    lineTo(5f, 15f)
                    lineTo(5f, 6f)
                    close()
                }
            }
        }.build()

        return _ChangeviewDark!!
    }

private var _ChangeviewDark: ImageVector? = null

