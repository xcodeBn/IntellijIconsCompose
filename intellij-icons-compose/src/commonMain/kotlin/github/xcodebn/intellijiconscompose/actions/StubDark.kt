package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StubDark: ImageVector
    get() {
        if (_StubDark != null) return _StubDark!!

        _StubDark = ImageVector.Builder(
            name = "StubDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                lineTo(2f, 1f)
                lineTo(7f, 6f)
                lineTo(12f, 1f)
                close()
                moveTo(13f, 2f)
                lineTo(8f, 7f)
                lineTo(13f, 12f)
                lineTo(13f, 2f)
                close()
                moveTo(2f, 13f)
                lineTo(12f, 13f)
                lineTo(7f, 8f)
                lineTo(2f, 13f)
                close()
                moveTo(1f, 12f)
                lineTo(6f, 7f)
                lineTo(1f, 2f)
                lineTo(1f, 12f)
                close()
                moveTo(-0f, 0f)
                lineTo(14f, 0f)
                lineTo(14f, 14f)
                lineTo(-0f, 14f)
                lineTo(-0f, 0f)
                close()
            }
        }.build()

        return _StubDark!!
    }

private var _StubDark: ImageVector? = null

