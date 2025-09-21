package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ErrorpointDark: ImageVector
    get() {
        if (_ErrorpointDark != null) return _ErrorpointDark!!

        _ErrorpointDark = ImageVector.Builder(
            name = "ErrorpointDark",
            defaultWidth = 6.0.dp,
            defaultHeight = 6.0.dp,
            viewportWidth = 6.0f,
            viewportHeight = 6.0f
        ).apply {

        }.build()

        return _ErrorpointDark!!
    }

private var _ErrorpointDark: ImageVector? = null

