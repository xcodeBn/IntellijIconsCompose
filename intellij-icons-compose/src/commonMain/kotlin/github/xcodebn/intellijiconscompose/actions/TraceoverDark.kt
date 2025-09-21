package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TraceoverDark: ImageVector
    get() {
        if (_TraceoverDark != null) return _TraceoverDark!!

        _TraceoverDark = ImageVector.Builder(
            name = "TraceoverDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(8f, 3f)
                lineTo(8f, 3f)
                lineTo(11f, 6f)
                lineTo(14f, 4f)
                lineTo(14f, 10f)
                lineTo(8f, 10f)
                lineTo(10f, 7f)
                lineTo(7f, 4f)
                lineTo(2f, 9f)
                lineTo(1f, 8f)
                lineTo(7f, 2f)
                lineTo(8f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF3592C4))
                ) {
                    moveTo(8f, 3f)
                    lineTo(8f, 3f)
                    lineTo(11f, 6f)
                    lineTo(14f, 4f)
                    lineTo(14f, 10f)
                    lineTo(8f, 10f)
                    lineTo(10f, 7f)
                    lineTo(7f, 4f)
                    lineTo(2f, 9f)
                    lineTo(1f, 8f)
                    lineTo(7f, 2f)
                    lineTo(8f, 3f)
                    close()
                }
            }
        }.build()

        return _TraceoverDark!!
    }

private var _TraceoverDark: ImageVector? = null

