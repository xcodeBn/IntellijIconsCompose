package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testcustom: ImageVector
    get() {
        if (_Testcustom != null) return _Testcustom!!

        _Testcustom = ImageVector.Builder(
            name = "Testcustom",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(6f, 11f)
                lineTo(6f, 11f)
                lineTo(6f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 11f)
                lineTo(4f, 7f)
                lineTo(5f, 7f)
                lineTo(6f, 10f)
                lineTo(7f, 5f)
                lineTo(7f, 5f)
                lineTo(9f, 10f)
                lineTo(10f, 5f)
                lineTo(10f, 5f)
                lineTo(12f, 9f)
                lineTo(11f, 9f)
                lineTo(10f, 6f)
                lineTo(9f, 11f)
                lineTo(9f, 11f)
                lineTo(8f, 11f)
                lineTo(7f, 6f)
                lineTo(6f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFF26522))
                ) {
                    moveTo(6f, 11f)
                    lineTo(6f, 11f)
                    lineTo(6f, 11f)
                    lineTo(5f, 11f)
                    lineTo(5f, 11f)
                    lineTo(4f, 7f)
                    lineTo(5f, 7f)
                    lineTo(6f, 10f)
                    lineTo(7f, 5f)
                    lineTo(7f, 5f)
                    lineTo(9f, 10f)
                    lineTo(10f, 5f)
                    lineTo(10f, 5f)
                    lineTo(12f, 9f)
                    lineTo(11f, 9f)
                    lineTo(10f, 6f)
                    lineTo(9f, 11f)
                    lineTo(9f, 11f)
                    lineTo(8f, 11f)
                    lineTo(7f, 6f)
                    lineTo(6f, 11f)
                    close()
                }
            }
        }.build()

        return _Testcustom!!
    }

private var _Testcustom: ImageVector? = null

