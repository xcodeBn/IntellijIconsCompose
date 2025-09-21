package github.xcodebn.intellijiconscompose.welcome.project

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RemovedisabledDark: ImageVector
    get() {
        if (_RemovedisabledDark != null) return _RemovedisabledDark!!

        _RemovedisabledDark = ImageVector.Builder(
            name = "RemovedisabledDark",
            defaultWidth = 10.0.dp,
            defaultHeight = 10.0.dp,
            viewportWidth = 10.0f,
            viewportHeight = 10.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6f)
                lineTo(6f, 11f)
                lineTo(4f, 11f)
                lineTo(4f, 6f)
                lineTo(-1f, 6f)
                lineTo(-1f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, -1f)
                lineTo(6f, -1f)
                lineTo(6f, 4f)
                lineTo(11f, 4f)
                lineTo(11f, 6f)
                lineTo(6f, 6f)
                close()
            }
        }.build()

        return _RemovedisabledDark!!
    }

private var _RemovedisabledDark: ImageVector? = null

