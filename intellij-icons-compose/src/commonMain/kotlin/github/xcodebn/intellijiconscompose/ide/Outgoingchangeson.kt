package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Outgoingchangeson: ImageVector
    get() {
        if (_Outgoingchangeson != null) return _Outgoingchangeson!!

        _Outgoingchangeson = ImageVector.Builder(
            name = "Outgoingchangeson",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(3f, 8f)
                lineTo(3f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 8f)
                lineTo(14f, 8f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 8f)
                lineTo(3f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(9f, 7f)
                lineTo(12f, 7f)
                lineTo(8f, 11f)
                lineTo(4f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 2f)
                lineTo(9f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(3f, 8f)
                    lineTo(3f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 8f)
                    lineTo(14f, 8f)
                    lineTo(14f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 8f)
                    lineTo(3f, 8f)
                    close()
                }
            }
        }.build()

        return _Outgoingchangeson!!
    }

private var _Outgoingchangeson: ImageVector? = null

