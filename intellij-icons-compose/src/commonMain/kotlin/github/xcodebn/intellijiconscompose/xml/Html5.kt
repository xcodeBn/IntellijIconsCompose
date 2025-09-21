package github.xcodebn.intellijiconscompose.xml

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Html5: ImageVector
    get() {
        if (_Html5 != null) return _Html5!!

        _Html5 = ImageVector.Builder(
            name = "Html5",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEBEBEB))
            ) {
                moveTo(2f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 7f)
                lineTo(3f, 7f)
                moveTo(3f, 8f)
                lineTo(4f, 8f)
                lineTo(4f, 9f)
                lineTo(6f, 10f)
                lineTo(6f, 11f)
                lineTo(3f, 10f)
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(10f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 4f)
                lineTo(10f, 4f)
                moveTo(10f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 9f)
                lineTo(6f, 10f)
                lineTo(6f, 11f)
                lineTo(9f, 10f)
            }
            path(
                fill = SolidColor(Color(0xFFE44D26))
            ) {
                moveTo(1f, 13f)
                lineTo(0f, 0f)
                lineTo(12f, 0f)
                lineTo(11f, 13f)
                lineTo(6f, 14f)
            }
            path(
                fill = SolidColor(Color(0xFFF16529))
            ) {
                moveTo(6f, 13f)
                lineTo(6f, 1f)
                lineTo(11f, 1f)
                lineTo(10f, 12f)
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFEBEBEB))
                ) {
                    moveTo(2f, 3f)
                    lineTo(6f, 3f)
                    lineTo(6f, 4f)
                    lineTo(4f, 4f)
                    lineTo(4f, 6f)
                    lineTo(6f, 6f)
                    lineTo(6f, 7f)
                    lineTo(3f, 7f)
                    moveTo(3f, 8f)
                    lineTo(4f, 8f)
                    lineTo(4f, 9f)
                    lineTo(6f, 10f)
                    lineTo(6f, 11f)
                    lineTo(3f, 10f)
                }
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(10f, 3f)
                    lineTo(6f, 3f)
                    lineTo(6f, 4f)
                    lineTo(10f, 4f)
                    moveTo(10f, 6f)
                    lineTo(6f, 6f)
                    lineTo(6f, 7f)
                    lineTo(8f, 7f)
                    lineTo(8f, 9f)
                    lineTo(6f, 10f)
                    lineTo(6f, 11f)
                    lineTo(9f, 10f)
                }
            }
        }.build()

        return _Html5!!
    }

private var _Html5: ImageVector? = null

