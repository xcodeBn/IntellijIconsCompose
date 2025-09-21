package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Homefolder: ImageVector
    get() {
        if (_Homefolder != null) return _Homefolder!!

        _Homefolder = ImageVector.Builder(
            name = "Homefolder",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 13f)
                lineTo(9f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 13f)
                lineTo(4f, 13f)
                lineTo(4f, 7f)
                lineTo(12f, 7f)
                lineTo(12f, 13f)
                lineTo(9f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 2f)
                lineTo(15f, 8f)
                lineTo(1f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 13f)
                    lineTo(9f, 10f)
                    lineTo(7f, 10f)
                    lineTo(7f, 13f)
                    lineTo(4f, 13f)
                    lineTo(4f, 7f)
                    lineTo(12f, 7f)
                    lineTo(12f, 13f)
                    lineTo(9f, 13f)
                    close()
                }
            }
        }.build()

        return _Homefolder!!
    }

private var _Homefolder: ImageVector? = null

